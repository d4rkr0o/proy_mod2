////////////  Biblioteca que realiza las conversiones para obtener el digest usando SHA1 en forma hexadecimal y lo regresa en un String /////////////
#include <openssl/sha.h>

void sha1BinToHex(const unsigned char *hashbin, char *const hashstr) 
{
  for(int i = 0; i<20; ++i)
		sprintf(&hashstr[i*2], "%02X", hashbin[i]);
	hashstr[40]=0;
}

string shaPass(string passBlank)
{
	char pass[512];
	unsigned char hashpass[SHA_DIGEST_LENGTH];
	char hashhexpass[41];
	string hashdefpass;
	strncpy(pass,passBlank.c_str(),strlen(passBlank.c_str()));
	pass[strlen(passBlank.c_str())]='\0';
	SHA_CTX ctx;
	SHA1_Init(&ctx);
	SHA1_Update(&ctx,pass,strlen(pass));
	SHA1_Final(hashpass,&ctx);
	sha1BinToHex(hashpass,hashhexpass);
	hashdefpass = hashhexpass;
	return hashdefpass;
}
