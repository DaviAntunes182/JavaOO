import java.math.BigDecimal;

public class Gerente extends Autenticavel{

    public BigDecimal getBoniticacao() {
        //super -> Quando o atributo/metodo vem da Super Classe
        return super.getSalario();
    }
}
