public class contaBancaria {
    int numeroDaConta;
    float saldo;

    // Construtor da classe ContaBancaria
    public contaBancaria(int numeroDaConta, float saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
