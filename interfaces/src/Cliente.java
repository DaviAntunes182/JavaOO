public class Cliente implements Autenticavel{

    private int senha;

    @Override
    public boolean autentica(int senha) {
        //return this.senha == senha;
        if(this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
