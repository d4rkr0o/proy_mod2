<?php

class Articulo{
	 public $arrayNames=array("First.jpg", "Second.jpg", "Third.jpg", "Fourth.jpg","Fifth.jpg","Sixth.jpg","Seventh.jpg","Eighth.jpg","Ninth.jpg","Tenth.jpg");
	
	public function retrieveAllContent($idNodo){
		$nodo=node_load($idNodo);
		$comentarios=array();
		$imageName='';
		switch($idNodo){
			case 1:
				$imageName= $this->arrayNames[0];
				break;
			case 2:
				$imageName=$this->arrayNames[1];
				break;
			case 3:
				$imageName=$this->arrayNames[2];
				break;
			case 4:
				$imageName=$this->arrayNames[3];
				break;
			case 5:
				$imageName=$this->arrayNames[4];
				break;
			case 6:
				$imageName=$this->arrayNames[5];
				break;
			case 7:
				$imageName=$this->arrayNames[6];
				break;
			case 8:
				$imageName=$this->arrayNames[7];
				break;
			case 9:
				$imageName=$this->arrayNames[8];
				break;
			case 10:
				$imageName=$this->arrayNames[9];
				break;
		}

		$body=field_get_items('node', $nodo, 'body');
		$result = field_view_field('node', $nodo, 'field_tags',array('default'));
		$terms=$result['#object']->field_tags['und'];
		$tags=array();
		foreach($terms as $term){
			array_push($tags, $term['taxonomy_term']->name);
		}
		



		
		$formatted_date=format_date($nodo->created,'nodes_date');
		$imagePath="/var/www/drupal/sites/default/files/styles/medium/public/field/image/".$imageName;
		$imgb64=base64_encode(file_get_contents($imagePath));
		$result= db_select('comment') ->fields('comment',array('cid'))->condition('nid',$nodo->nid,'=')->execute();
		$cids = $result->fetchCol();
		$comments = comment_load_multiple($cids);
		$j=0;
		foreach($comments as &$comment){
			$comentarios[''.$j]=$comment->comment_body ['und'][0] ['value'];
			$j++;	
		}
		$elementos=array("Titulo" => $nodo->title, "Fecha" => $formatted_date , "Imagen"=>$imgb64, "Body" => $body[0]['value'], "Comments" => $comentarios, "ImagePath"=>$imagePath, "Contador"=>$j, "Taxonomy" => $tags);

		echo json_encode($elementos);

	}


	public function getImages(){
		$finalArray=array();
		$pathArray=array();
		for($i=1, $j=0;$i<=10;$i++, $j++){
			$node=node_load($i);
			$imagePath="/var/www/drupal/sites/default/files/styles/medium/public/field/image/".(string)$this->arrayNames[$j];
			$imagenb64=base64_encode(file_get_contents($imagePath));
			$result = field_view_field('node', $node, 'field_tags',array    ('default'));
                        $terms=$result['#object']->field_tags['und'];
                        $tags=array();
                        foreach($terms as $term){
                          array_push($tags, $term['taxonomy_term']->name);
                        } 

			$imagenesArray=array("Titulo"=> $node->title, "Imagenb64"=>$imagenb64, "IdNodo"=>$i, "Categorias"=>$tags);
			$finalArray[$i]=$imagenesArray;

		}
//		echo $imagePath;	
//		drupal_add_http_header('Content-Type', 'application/json');			
//		echo drupal_json_encode($finalArray);
		echo json_encode($finalArray);

	}

	public function postComment($idNodo,$comentarios){
			$node=node_load($idNodo);
			$comment = (object) array(
    			'nid' => $node->nid,
    			'cid' => 0,
    			'pid' => 0,
    			'uid' => 0,
    			'mail' => '',
    			'is_anonymous' => 0,
    			'homepage' => '',
    			'status' => COMMENT_PUBLISHED,
    			'subject' => 'Just Cars',
    			'language' => LANGUAGE_NONE,
    			'comment_body' => array(
      			LANGUAGE_NONE => array(
        			0 => array (
          			'value' => $comentarios,
          			'format' => 'filtered_html'
       			 )
     			 )
    			),
  		);
  		comment_submit($comment);
  		comment_save($comment);

        $response=array("Respuesta"=>"Comentario agregado");  
	//echo "Posteando comentario ".$comentarios;
	echo json_encode($response);
	}


}
