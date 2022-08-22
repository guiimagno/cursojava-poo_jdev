package cursojava.principio.responsabilidade;

public class appTestConta {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setDescricao("Conta bancaria de Guilherme");

        System.out.println(contaBancaria);

        contaBancaria.diminui100Reais();
        System.out.println(contaBancaria);
        contaBancaria.soma100Reais();
        System.out.println(contaBancaria);
        contaBancaria.sacarDinheiro(400);
        contaBancaria.depositarDinheiro(10);

        System.out.println(contaBancaria);
    }
}
