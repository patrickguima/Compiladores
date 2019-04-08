DIGITO	[0-9]
LETRA	[a-zA-Z]
PALAVRARESERVADA "main"|"void"|"int"|"float"|"char"|"bool"|"true"|"false"
COMANDO "+"|"-"|":="|"if"|"while"|"return"|"do"|"skip"
PARENTESES "("|")"
CHAVES "{"|"}"
ID	{LETRA}({LETRA}|{DIGITO})*
FIMLINHA ";"
%%
{PALAVRARESERVADA} {printf("palavra reservada: %s\n", yytext);}
{PARENTESES} {printf("parenteses: %s\n", yytext);}
{COMANDO} {printf("operacao: %s\n", yytext);}
{CHAVES} {printf("chaves: %s\n", yytext);}
{FIMLINHA} {printf("final de linha: %s\n", yytext);}
{DIGITO}+		{printf("Inteiro: %s\n",yytext);}
{DIGITO}+"."{DIGITO}+	{printf("Real: %s\n",yytext);} 
{ID}			{printf("var: %s\n",yytext);}

%%
int yywrap();

main(){
  yylex();
}

int yywrap(){
 return 1;
}
