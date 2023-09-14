import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero=0;
        Scanner s= new Scanner (System.in);

        System.out.println("Digite um umero inteiro: ");
        numero= s.nextInt();

        if (numero %2==0); {
            System.out.println("o numero é par!");
        }
        else; {
            System.out.println("o numero é impar!");
        }
    }
}
