

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

// 25

public class piramidal {
    public static void main(String[] args) {
        int num_primos = 2;   // Número inicial para verificar se é primo
        int[] primos = new int[102]; // Array para armazenar números primos
        int count = 0; // Contador para o número de primos encontrados
        
        // Encontrar e armazenar números primos
        while (count < 102) { // Precisamos de 102 números primos para garantir 100 somas deslizantes
            if (Primo(num_primos)) {
                primos[count] = num_primos;
                count++;
            }
            num_primos++;
        }
        
        // Calcular e imprimir as primeiras 100 somas de grupos de 3 números primos
        System.out.println("Primeiros 100 valores das somas:");
        for (int i = 0; i < 100; i++) {
            int soma = primos[i] + primos[i + 1] + primos[i + 2];
            System.out.println(soma);
        }
    }

    public static boolean Primo(int numero) {
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }
        return true;
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

