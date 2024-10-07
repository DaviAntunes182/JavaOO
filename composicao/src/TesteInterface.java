public class TesteInterface {
    public static void main(String[] args) {
        Autenticavel referencia = new Gerente();
        Gerente gerente= new Gerente();
        gerente.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(3333);

        Administrador administrador = new Administrador();
        administrador.setSenha(4444);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(cliente);
        si.autentica(administrador);
    }
}