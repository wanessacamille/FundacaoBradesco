ingresso= int(input('digite qual ingresso vc deseja: 1 para vip e 2 para standdard'))
combo= int(input('digite o tipo de combo: 1 com pipoca, 2 sem pipoca' ))
if ingresso==1:
    if combo==1:
        print ('ingresso vip com pipoca: valor 110 reais')
    else:
        print ('ingresso sem pipoca: valor 80 reais')

else:
    if combo==1:
        print ('ingresso standard com pipoca : valor 70 reais')
    else:
        print ('ingresso standard sem pipoca: valor 40 reais')
