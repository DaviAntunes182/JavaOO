//Contrato autenticavel
    //quem assinar o contrato, precisa implementar
        //metodo setSenha
        //metodo autentica
public interface Autenticavel{
    //Uma interface não pode ter métodos e atributos concretos
    public boolean autentica(int senha);

    public void setSenha(int senha) ;
}
