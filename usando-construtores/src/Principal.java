public class Principal {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar("200");

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar("500");

        cc.tranferir(cp, "100");

        System.out.println(cp.getSaldo());
        System.out.println(cc.getSaldo());

    }
}
