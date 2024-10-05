import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        //Instanciando uma conta
        new Conta();
        //Guardando em uma variável para referênciar
        Conta c1 = new Conta();
        c1.saldo = new BigDecimal("200");

        Conta c2 = new Conta();
        c2.saldo = new BigDecimal("300");
        c2.saldo = c2.saldo.add(c1.saldo);
        c2.agencia = 146;

        System.out.printf("""
                Saldo primeira conta: %.2f
                """,c1.saldo);
        System.out.printf("""
                Segunda Conta
                Saldo: %.2f
                Agência: %d
                """, c2.saldo, c2.agencia);

    }
}
