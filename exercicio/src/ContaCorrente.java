import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        //Chama um contrutor da classe super
        super(agencia, numero);
    }

    //Redefinindo um método, sobrescrevendo
    @Override
    public String sacar(String valor) {
        BigDecimal taxa = new BigDecimal("0.25");
        String valorASacar = new BigDecimal(valor).add(taxa).toString();
        return super.sacar(valorASacar);
    }

    @Override
    public BigDecimal getValorImposto() {
        BigDecimal taxaCorrente = new BigDecimal("0.1");
        return super.getSaldo().multiply(taxaCorrente);
    }
}
