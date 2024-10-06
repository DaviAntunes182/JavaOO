public class Principal {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("123.456.789-10");
        paulo.setProfissao("Programador");

        Conta c1 = new Conta();
        c1.setTitular(paulo);

        Cliente ref = c1.getTitular();

        //Getter da referência
        System.out.println(c1.getTitular().getNome());
        System.out.println(paulo.getNome());
        System.out.println();
        System.out.println(ref);
        System.out.println(paulo);
        System.out.println(c1.getTitular());
    }
}
