class Funcionario {
    int codigo;
    float salario;
    int quantidadeHoras;
    float valorHora;

    // Construtor
    public Funcionario(int codigo, int quantidadeHoras, float valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        this.salario = calcularSalario();
    }

    // Método que calcula o salário
    public float calcularSalario() {
        return (quantidadeHoras * valorHora) + calcularHorasExtras();
    }

    // Método que calcula o valor das horas extras
    public float calcularHorasExtras() {
        float valorHoraExtra = valorHora * 1.5f; // Acrescenta 50%
        int horasExtras = quantidadeHoras > 40 ? quantidadeHoras - 40 : 0; // Considera 40 horas como padrão
        return horasExtras * valorHoraExtra;
    }

    // Exibe as informações do funcionário
    public void exibir() {
        System.out.println("Código: " + codigo);
        System.out.println("Salário: " + salario);
        System.out.println("Horas Trabalhadas: " + quantidadeHoras);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Valor Horas Extras: " + calcularHorasExtras());
        System.out.println("------------------------------");
    }
}

class FolhaPagamento {
    Funcionario[] funcionarios = new Funcionario[50];
    int count = 0;

    // Método para adicionar um funcionário ao vetor
    public void adicionarFuncionario(Funcionario func) {
        if (count < funcionarios.length) {
            funcionarios[count++] = func;
        }
    }

    // Método que ordena os funcionários por salário em ordem decrescente
    public void ordenar() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (funcionarios[i].salario < funcionarios[j].salario) {
                    Funcionario temp = funcionarios[i];
                    funcionarios[i] = funcionarios[j];
                    funcionarios[j] = temp;
                }
            }
        }
    }

    // Método que exibe as informações de todos os funcionários
    public void exibir() {
        for (int i = 0; i < count; i++) {
            funcionarios[i].exibir();
        }
    }

    // Método main para testar a implementação
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        // Adicionando alguns funcionários
        folha.adicionarFuncionario(new Funcionario(1, 42, 50)); // Funcionário 1
        folha.adicionarFuncionario(new Funcionario(2, 38, 45)); // Funcionário 2
        folha.adicionarFuncionario(new Funcionario(3, 45, 55)); // Funcionário 3

        // Ordenando por salário em ordem decrescente
        folha.ordenar();

        // Exibindo as informações dos funcionários
        folha.exibir();
    }
    }
