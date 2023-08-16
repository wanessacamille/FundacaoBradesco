contador=0
soma=0
print ('sistema para media de alturas {05 pessoas}')

for contador in range (0,5) :
    altura= float(input('digite o valor da altura: '))
    soma= soma + altura
    contador = contador +1
media= soma/contador
print ('a media de alturas é de: ', media)