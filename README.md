# Compiladores

**DATAS IMPORTANTES**  
17/04 - Duvidas dos Trabalhos  
23/04 - Ultima Materia  
24/04 - Apresentação dos Trabalhos  
30/04 - Prova

4 e 5/6 - NÃO VAI TER AULA

Aula 19/03

**Exercicios**   
- adicionar numeros naturais (DONE).
- adcionar subtraçao e divisao. 
- substituir o back end por um interpretador.    

**TRABALHO - 1**

Implementar uma maquina de pilha que execute o codigo gerado pelo compilador didatico( qualquer linguagem)

**TRABALHO - 2** 
Analisador Léxico para linguagem Mojica.
Criar as expressões regulares que classificam todas as palavras no código.

Como executar:

1 - Executar o Flex para o arquivo de definição (supondo que seu nome seja lex01.l):
	`$ flex l1.l`
	Isso produzirá uma arquivo na linguagem C que equivale ao scanner. O arquivo tem sempre o nome lex.yy.c
	
2 - Compilar o código C gerado pelo Flex:
	`$ gcc lex.yy.c -o lex01`
	
3- Executar o scanner gerado:
	`$ ./lex01`


**TRABALHO - 3**    

Implementar um parser para a linguagem Lugosi usando a ferramente javacc e desenvolver 3 exemplos em lugosi que usem boa parte da linguagem  

Instruções:  
`javacc Lugosi.jj`  
`javac *.java`  
`java Lugosi test.lug`

**TRABALHO FINAL**   
Construir arvore sintatica do programa e reconstruir o porgrama através da árvore;
