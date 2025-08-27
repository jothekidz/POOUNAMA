public class testeContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123", "Maria");
        conta.depositar(500);
        conta.sacar(200);
    }
}
