import java.util.Scanner;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        double media = 0, n1 = 0, n2 = 0;

        Scanner s= new Scanner(System.in);

        System.out.println("DIGITE O N1: ");
        n1= s.nextDouble();

        System.out.println("DIGITE O N2: ");
        n1= s.nextDouble();

        media = (n1 + n2) / 2;
        System.out.println("A média de n1 e n2 é: " +media);
    }
}
