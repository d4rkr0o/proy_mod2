///// CODIGO FUENTE DE CGI DE AUTENTICACION -> Omar DOminguez /////
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <string> 
#include <boost/algorithm/string.hpp>
#include "cgicc/CgiDefs.h"
#include "cgicc/Cgicc.h"
#include "cgicc/HTTPHTMLHeader.h"
#include "cgicc/HTMLClasses.h" 
#include "connoracle.h"
#include "sha1tool.h"

using namespace std;
using namespace cgicc;    
using namespace boost;


int logerror()
{
	cout << "<p><h3> Nombre o password incorrecto D: </h3><p>";
	return -1;
}

int main(int argc, char **argv)
{
	string passBase;
	string usuario;
	string tmppass;
	string hashdefpass;

	Cgicc formData;
	// Cabecera para el CGI Content-type: text/html
	cout << HTTPHTMLHeader() << endl;
	// DOCTYPE => <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
	cout << HTMLDoctype(HTMLDoctype::eStrict) << endl;
	// LENGUAJE  <html lang="en" dir="LTR">
	cout << html().set("lang", "ES").set("dir", "LTR") << endl;
  // Inicio del archivo CGI
	cout << html() << head() << title("Bienvenido Webapp Mod2") << head() << endl;
	//cout << body().set("bgcolor","#cccccc").set("text","#000000").set("link","#0000ff").set("vlink","#000080") << endl;
	cout << body().set("bgcolor","#CFC9C9").set("text","#000000") << endl;
	cout << h1("Pagina de login") << endl;
	form_iterator fuser = formData.getElement("user");
	if( !fuser->isEmpty() && fuser != (*formData).end())
		usuario=**fuser;
 	else
		logerror();
	form_iterator fpass = formData.getElement("pass");
	if( !fpass->isEmpty() && fpass != (*formData).end()) 
	 	tmppass=**fpass;
 	else
		logerror();
	passBase = query(usuario);
	if(passBase == "" || passBase.empty())
		logerror();
	hashdefpass = shaPass(tmppass);
	if (iequals(passBase,hashdefpass))
		cout << "<p><h3> Bienvenido! " << usuario << " :D </h3><p>";
	else
		logerror();
	cout << p();
	cout << body() << html();
	return 0;
}
