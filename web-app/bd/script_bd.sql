  CREATE TABLE usuarios (
    idUsuario VARCHAR(100)     NOT NULL ,
    contrasena VARCHAR(45)     NOT NULL ,
    camp_1 VARCHAR(45)    ,
    camp_2 VARCHAR(45)    ,
    camp_3 VARCHAR(45)    ,
    camp_4 VARCHAR(45)    ,
    camp_5 VARCHAR(45)    ,
    camp_6 VARCHAR(45)    , 
    camp_7 VARCHAR(45)    , 
    camp_8 VARCHAR(45)    ,
    camp_9 VARCHAR(45)    ,
    isAdmin INTEGER	  ,
  PRIMARY KEY(idUsuario));
INSERT INTO usuarios (idUsuario,contrasena,isAdmin) VALUES ('admin@admin','08dc39f5d2ee9fb1b4c74c96cb848924571275b8',1);
COMMIT;

