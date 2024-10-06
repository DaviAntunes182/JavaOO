import java.math.BigDecimal;

public class Administrador extends Autenticavel{

    @Override
    public BigDecimal getBoniticacao() {
        return new BigDecimal("50");
    }
}
