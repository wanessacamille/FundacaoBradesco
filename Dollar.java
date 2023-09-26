import java.util.Scanner;
public class Dollar {
    
    public static void main(String[] args) {
        
        double qtdDollar, cotacao, real;

        Scanner s= new Scanner (System.in);

        System.out.println("digite a sua quantidade de Dolares");
        qtdDollar= s.nextDouble();

        System.out.println("Digite a cotação do Dolar: ");
        cotacao= s.nextDouble();

        real= qtdDollar * cotacao;

        System.out.println(real);
    }
}
