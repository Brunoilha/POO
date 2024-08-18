

///24
import java.util.Scanner;

public class numero_perfeito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            
            int numero = input.nextInt();  

            int soma = somaDivisores(numero);  
            
            if (soma == numero) {
                System.out.println(numero + " é perfeito.");
            } else {
                System.out.println(numero + " não é perfeito.");
            }
        }

        input.close();  
    }

    
    public static int somaDivisores(int numero) {
        int soma = 0;

        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {  
                soma += i;
            }
        }

        return soma;  
    }
}
