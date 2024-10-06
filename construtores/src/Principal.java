public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta(1337, 24226);
        Conta c2 = new Conta(1421, 12345);
        Conta c3 = new Conta(1982, 23172);

        System.out.println(Conta.getTotal());
    }
}
