sabor= int(input('Informe o sabor do sorvete: {Digitando 1-Chocolate e 2-Morango. \n'))
bolas= int(input('informe a quantidade de bolas: '))

if sabor==1 :
   if bolas >3 :
    print ('vc tem direito a um desconto de 10%')

   else:
    print ('vc tem direito a um desconto de 5%')

elif sabor==2:
    print ('vc não tem nenhum desconto')