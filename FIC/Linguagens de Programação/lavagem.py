lavagem= int(input('Digite o tipo de lavagem: {Digitando 1- Lavagem simples ou 2- Lavagem completa. \n'))
pagamento= int(input('Digite a forma de pagamento: {Digitando 1-A vista ou 2-Cartão \n'))

if lavagem==1:
      if pagamento==1:
        print ('Lavagem simples a vista, no valor de 30 reais.')
      else:
        print ('Lavagem simples no cartão, no valor de 35 reais.')
else:
    if pagamento==2:
        print ('Lavagem completa no cartão, no valor de 55 reais.')
    else :
        print ('Lavagem completa a vista, no valor de 50 reais.')