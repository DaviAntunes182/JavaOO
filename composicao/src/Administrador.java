import java.math.BigDecimal;

public class Administrador extends Funcionario implements Autenticavel{
    private AutenticacaoUtil autenticacaoUtil;

    public Administrador(){
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public BigDecimal getBoniticacao() {
        return new BigDecimal("50");
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        //return this.senha == senha;
        return this.autenticacaoUtil.autentica(senha);
    }
}
