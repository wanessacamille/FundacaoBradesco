import java.util.Scanner;

public class Sorvete {
    public static void main(String[] args) {
        int sabor;
        int bolas;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o sabor do sorvete: Digitando 1-Chocolate e 2-Morango.");
        sabor= s.nextInt();

        System.out.println("Informe a quantidade de bolas: ");
        bolas= s.nextInt();

        if (sabor==1) {
              if (bolas >3) ;
              System.out.println("você tem direito a um desconto de 10%");
        } else {
            System.out.println("você tem direito a um desconto de 5%");
        }
        if (sabor==2){
        System.out.println("você não tem nenhum desconto!");
        }
    }
}
