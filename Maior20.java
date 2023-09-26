import java.util.Scanner;
public class Maior20 {
    public static void main(String[] args) {
        
        int numero=0;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = s.nextInt();

        if (numero >20){
        System.out.println(numero);
        }else{
        System.out.println("número inválido!");
        }
    }
}
