numeroHoras= int(input('informe o numero de horas trabalhadas: '))
quantidadeHe=0
valorHora= float(input('informe o valor do salario por hora: '))
salarioTotal=0

if numeroHoras>160:
    quantidadeHe = numeroHoras - 160
salarioTotal = (valorHora *160) + (quantidadeHe*1.5)* valorHora

print (' o salario total é de: R$',salarioTotal)
