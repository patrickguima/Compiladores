import java.io.*;

enum TokenType{ NUM,SOMA, MULT,APar,FPar, EOF}

class Token{
  String lexema;
  TokenType token;

 Token (String l, TokenType t)
 	{ lexema=l;token = t;}	

}

class AnaliseLexica {

	BufferedReader arquivo;

	AnaliseLexica(String a) throws Exception
	{
		
	 	this.arquivo = new BufferedReader(new FileReader(a));
		
	}

	Token getNextToken() throws Exception
	{	
		Token token;
		int eof = -1;
		char currchar;
		int currchar1;
		String tokenOut="";


			do{
				currchar1 =  arquivo.read();
				currchar = (char) currchar1;
			} while (currchar == '\n' || currchar == ' ' || currchar =='\t' || currchar == '\r');
			//System.out.println(currchar1);
			if(currchar1 != eof && currchar1 !=10)
			{
								
				
				//System.out.println(tokenOut);
				if (currchar >= '0' && currchar <= '9'){
					while(currchar >= '0' && currchar <= '9'){
						arquivo.mark(0);
						tokenOut+= currchar;
						currchar1 =  arquivo.read();
						currchar = (char) currchar1;
					}
					arquivo.reset();

					return (new Token (tokenOut, TokenType.NUM));
				}
				else{
					tokenOut+= currchar;
					switch (currchar){
						case '(':
							return (new Token (tokenOut,TokenType.APar));
						case ')':
							return (new Token (tokenOut,TokenType.FPar));
						case '+':
							return (new Token (tokenOut,TokenType.SOMA));
						case '*':
							return (new Token (tokenOut,TokenType.MULT));
						
						default: throw (new Exception("Caractere inválido: " + ((int) currchar)));
					}
				}
			}

			arquivo.close();
			
		return (new Token(tokenOut,TokenType.EOF));
		
	}
}
