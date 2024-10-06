import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
        //Chama um contrutor da classe super
        super(agencia, numero);
    }

    //Redefinindo um método, sobrescrevendo
    @Override
    public String sacar(String valor) {
        BigDecimal taxa = new BigDecimal("0.2");
        String valorASacar = new BigDecimal(valor).add(taxa).toString();
        return super.sacar(valorASacar);
    }
}
