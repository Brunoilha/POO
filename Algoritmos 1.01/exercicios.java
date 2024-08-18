

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

// 32
import java.util.Scanner;

public class CalculadoraCPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê os 9 primeiros dígitos do CPF
        System.out.print("Digite os 9 primeiros dígitos do CPF: ");
        String cpf = input.nextLine();

        // Verifica se a entrada tem exatamente 9 dígitos
        if (cpf.length() != 9 || !cpf.matches("\\d+")) {
            System.out.println("Entrada inválida. Certifique-se de digitar exatamente 9 dígitos.");
            return;
        }

        // Converte a string em um array de inteiros
        int[] cpfArray = new int[9];
        for (int i = 0; i < 9; i++) {
            cpfArray[i] = Character.getNumericValue(cpf.charAt(i));
        }

        // Calcula o primeiro dígito verificador (j)
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += (10 - i) * cpfArray[i];
        }
        int resto1 = soma1 % 11;
        int digito1 = (resto1 == 0 || resto1 == 1) ? 0 : 11 - resto1;

        // Calcula o segundo dígito verificador (k)
        int soma2 = 0;
        for (int i = 0; i < 9; i++) {
            soma2 += (11 - i) * cpfArray[i];
        }
        soma2 += 2 * digito1;  // Inclui o primeiro dígito verificador na soma
        int resto2 = soma2 % 11;
        int digito2 = (resto2 == 0 || resto2 == 1) ? 0 : 11 - resto2;

        // Imprime os dígitos verificadores
        System.out.println("Dígito verificador 1 (j): " + digito1);
        System.out.println("Dígito verificador 2 (k): " + digito2);

        input.close();
    }
}

