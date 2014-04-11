///////// BIBLIOTECA QUE REALIZA EL TRABAJO DE LA CONEXION A LA BASE DE DATOS REGRESANDO UNICAMENTE LA CONTRASEÑA EN CASO DE /////////////
//////// QUE EL USUARIO REQUERIDO EXISTA EN LA BASE DE DATOS  //////////////////////
#include <occi.h>

using namespace std;
using namespace oracle::occi;

string query(string usuario)
{
	const string userDB = "system";
	const string passDB = "hola123,";
	const string DB = "localhost:1521/XE";
	string consulta = "SELECT contrasena from usuarios WHERE usuario=\'" + usuario +  "\'";
	string pass;
	Environment *env = Environment::createEnvironment(Environment::DEFAULT);
	Connection *conn = env->createConnection(userDB, passDB, DB); 
	Statement *stmt = conn->createStatement(consulta);
	ResultSet *rs = stmt->executeQuery();
	if(rs->isNull(rs->next()))
	{
		pass="";
	}
	else
	cout << rs->getString(1);
	pass=rs->getString(1);
	stmt->closeResultSet(rs);
	conn->terminateStatement(stmt);
	env->terminateConnection(conn);
	Environment::terminateEnvironment(env);
	return pass;
}
