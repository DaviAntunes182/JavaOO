public class Associar {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "123.456.789-10";
        paulo.profissao = "Programador";

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.titular = paulo;
        c2.titular = new Cliente();
        c2.titular.nome = "Marcela";

        System.out.println(c1.titular.nome);
        System.out.println(c2.titular.nome);
    }
}
