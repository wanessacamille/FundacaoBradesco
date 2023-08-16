contador=0
soma=0
print ('sistema para media de alturas {05 pessoas}')

while contador <5 :
    altura= float(input('digite o valor da altura: '))
    soma= soma + altura
    contador = contador +1
media= soma/contador
print ('a media de alturas é de: ', media)