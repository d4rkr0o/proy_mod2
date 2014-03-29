  CREATE TABLE usuarios (
    idUsuario VARCHAR(100)     NOT NULL ,
    nombre    VARCHAR(45)      NOT NULL ,
    apellido  VARCHAR(45)      NOT NULL ,
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
  PRIMARY KEY(idUsuario));
INSERT INTO usuarios (idUsuario,nombre,apellido,contrasena) VALUES ('admin@admin','Administrator','Admin','08dc39f5d2ee9fb1b4c74c96cb848924571275b8');
COMMIT;

