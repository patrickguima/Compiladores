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

