import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        double valor1 = 0, valor2 = 0, resultado = 0;
        int operacao = 0;
        Scanner s = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.println("Informe o primeiro valor: ");
        valor1 = s.nextDouble();

        System.out.println("Informe o segundo valor: ");
        valor2 = s.nextDouble();

        System.out.println(
                "Informe a operação: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Para avaliar o maior número\nInforme o valor:");
        operacao = s.nextInt();

        switch (operacao) {
            case 1:
                resultado = c.soma(valor1, valor2);
                break;
            case 2:
                resultado = c.subtracao(valor1, valor2);
                break;
            case 3:
                resultado = c.multiplicacao(valor1, valor2);
                break;
            case 4:
                resultado = c.divisao(valor1, valor2);
                break;
            case 5:
                resultado = c.maior(valor1, valor2);
                break;

            default:
                System.out.println("Opção inválida!!!");
        }

        System.out.println("O resultado é: " + resultado);
        // s.close();
    }
}
