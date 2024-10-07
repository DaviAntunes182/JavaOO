public class Principal {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar("200");

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(sv);
        System.out.println(ci.getTotalImposto().toString());

        ci.registra(cc);
        System.out.println(ci.getTotalImposto().toString());

    }
}
