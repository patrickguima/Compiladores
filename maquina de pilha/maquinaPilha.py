def maquina(texto):
    pilha = []
    for text in texto:
        comando = text.split()
        if len(comando) > 0:
            if comando[0] == 'PUSH':
                if len(comando) > 1:
                    pilha.append(comando[1])
                else:
                    print("ERRO PUSH")
                    break

            elif comando[0] == 'SUM':
                if len(pilha) >= 2:
                    num2 = float(pilha.pop())
                    num1 = float(pilha.pop())
                    result = num1 + num2
                    pilha.append(result)
                else:
                    print("ERRO SUM")
                    break
            elif comando[0] == 'MULT':
                
                if len(pilha) >= 2:
                    
                    num2 = float(pilha.pop())
                    num1  = float(pilha.pop())
                    result = num1 * num2
                    pilha.append(result)
                else:
                    print("ERRO MULT")
                    break

            elif comando[0] == 'SUB':
                if len(pilha)>=2:
                    num2  =float(pilha.pop())
                    num1 = float(pilha.pop())
                    result = num1 - num2
                    pilha.append(result)
                else:
                    print("ERRO SUB")
                    break
            elif comando[0] == 'DIV':             
                if len(pilha)>=2:
                    num2  =float(pilha.pop())
                    num1 = float(pilha.pop())
                    if(num2 == 0.0):
                        print("ERRO DIVISAO POR ZERO")
                        break
                    result = num1/num2
                    pilha.append(result)
                    
                else:
                    print("ERRO DIV")
                    break
            elif comando[0] =='PRINT':
                if len(pilha)==1:
                    result = pilha.pop()
                    print(result)
                else: 
                   
                    break
        else:
           
            break


def main():
    arq = open('teste.txt','r')
    texto = arq.readlines()
    #print(texto)
    maquina(texto)
    arq.close()





main()
