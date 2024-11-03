public class Menu {

    public static void main(String[] args) {
        Cliente juliane = new Cliente();
        juliane.setNome("juliane");
        Conta cc = new ContaCorrente(juliane);
        Conta cp = new ContaPoupanca(juliane);

        cc.depositar(500);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
