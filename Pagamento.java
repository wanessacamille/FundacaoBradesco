import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        
        int matricula=0;
        int ultimodigito=0;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o numero da matricula: ");
        matricula= s.nextInt();

        ultimodigito = matricula % 10;

        switch (ultimodigito)
        {
            case 0:
            System.out.println("Pagamento em Janeiro.");
            break;

            case 1:
            System.out.println("Pagamento em Fevereiro.");
            break;

            case 2:
            System.out.println("Pagamento em Março.");
            break;

            case 3,4,5,6,7,8,9:
            System.out.println("Pagamento em Abril.");
            break;
        }
    }
}
