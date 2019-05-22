class ArvoreLugosi{
	Main main;
	ArrayList <Func> funcoes;
}

class Main{
	ArrayList <VarDecl> varDecl;
	ArrayList <Comando> comandos;
}

class VarDecl{
	Tipo tipo;
	String var;
}

class Tipo{}
class Int extends Tipo{}
class Bool extends Tipo{}

class Comando{}
class Atribuicao extends Comando{
	String var;
	Exp exp;
}
class ChamadaFuncao extends Comando{
	String nomeFuncao;
	ArrayList <Exp> argumentos;
}
class If extends Comando{
	Exp exp;
	ArrayList <Comando> then;
}
class While extends Comando{
	Exp exp;
	ArrayList <Comando> comandos;
}
class DoWhile extends Comando{
	ArrayList <Comando> comandos;
	Exp exp;
}
class Return extends Comando{
	Exp exp;
} 
class Print extends Comando{
	Exp exp;
}

class Exp{}
class OperadorExp extends Exp{
	Exp arg1;
	Exp arg2;
	String op;
}
class Fator extends Exp{}
class TokenId extends Fator{
	String id;
}
class ListaExp extends Fator{
	String id;
	ArrayList <Exp> listExp;
}