import java.math.BigDecimal;

public class Administrador extends Funcionario implements Autenticavel{
    private int senha;

    @Override
    public BigDecimal getBoniticacao() {
        return new BigDecimal("50");
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
