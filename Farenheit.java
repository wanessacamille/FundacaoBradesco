import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        int c, f;

        Scanner s= new Scanner (System.in);

        System.out.println("digite uma temperatura em grau celsius: ");
        c= s.nextInt();
        
        f= (9*c+160)/5;

        System.out.println(f);

    }
}
