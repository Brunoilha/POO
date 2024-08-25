import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Criando um cliente
        cliente cliente = new cliente("Bruno", "000.000.000-00", "Rua 3");

        // Criando uma conta bancária
        contaBancaria conta = new contaBancaria(262156656, 500.0f);

        // Exibindo saldo inicial
        conta.exibirSaldo();

        // Solicitando valor de depósito ao usuário
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor que deseja depositar: ");
        float valorDeposito = input.nextFloat();
        
        // Realizando o depósito
        conta.depositar(valorDeposito);

        // Exibindo saldo após o depósito
        conta.exibirSaldo();

        input.close(); // Fechar o scanner após o uso
    }
}
