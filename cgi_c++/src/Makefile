##### ARCHIVO DE COMPILACION PARA EL CODIGO FUENTE DEL CGI #####
export SHELL=/bin/bash

target: auth.cpp
	g++ -o auth.cgi auth.cpp -I$(ORACLE_HOME)/sdk/include -L$(ORACLE_HOME) -lcgicc -lssl -lclntsh -locci 

debug: auth.cpp
	g++ -ggdb3 -o auth.cgi auth.cpp -I$(ORACLE_HOME)/sdk/include -L$(ORACLE_HOME) -lclntsh -locci -lcgicc -lssl

clean: rm -f auth.cgi
