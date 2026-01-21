package empresa;

public class RodarAplicacao {
    public static void main(String[] args) {
        // upcasting
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();

        Funcionario vendedor = new Vendedor();

        Funcionario faxineiro = new Faxineiro();
    }
}
