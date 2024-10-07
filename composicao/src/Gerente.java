import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel{
    //Gerente tem um autenticação útil
    private AutenticacaoUtil autenticacaoUtil;

    //Quando um gerente é instanciado o útil também é!
    public Gerente(){
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    public BigDecimal getBoniticacao() {
        //super -> Quando o atributo/metodo vem da Super Classe
        return super.getSalario();
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
