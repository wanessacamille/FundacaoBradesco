import java.util.Scanner;

import javax.annotation.processing.ProcessingEnvironment;
public class Produto {
    public static void main(String[] args) {
        
        double custo; 
        double porcetual;
        double venda;

        Scanner s= new Scanner(System.in);

        System.out.println("informe o preço de custo: ");
        custo= s.nextDouble();

        System.out.println("Digite o percentual para venda: ");
        porcetual= s.nextDouble();

        porcetual= (porcetual/100) * 1.500;
        venda = custo + porcetual;
        
        System.out.println(venda);

        
    }
}
