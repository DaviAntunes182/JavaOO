import java.math.BigDecimal;

public class Gerente extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public BigDecimal getBoniticacao() {
        //super -> Quando o atributo/metodo vem da Super Classe
        return super.getSalario();
    }
}
