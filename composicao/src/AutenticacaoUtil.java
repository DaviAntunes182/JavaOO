public class AutenticacaoUtil {
    //Composição detêm a lógica do código e prove as outras
    //classes essa lógica, reutilizando código
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        //return this.senha == senha;
        if(this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

}