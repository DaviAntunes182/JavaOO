public abstract class Autenticavel extends Funcionario{
    //Não precisam aplicar o método da classe mãe
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

}
