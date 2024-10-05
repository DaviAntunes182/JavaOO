public class Metodos {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.depositar("200");
        c1.depositar("-5");
        System.out.println(c1.saldo);

        System.out.println(c1.sacar("100"));
        System.out.println(c1.saldo);

        c1.tranferir(c2, "200");
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
