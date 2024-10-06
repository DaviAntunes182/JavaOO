public class Principal {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        Gerente marco = new Gerente();
        //Todo gerente é funcionario
        Funcionario teste = new Gerente();
        //Nem todo funcionario é gerente
        //Gerente teste = new Funcionario();

        //Funcionarios não podem acessar os métodos de gerente
        //
        //teste.autentica(2132);

        nico.setNome("Nico Steppat");
        nico.setCpf("123456789-9");
        nico.setSalario("2600.00");

        marco.setNome("Marco");
        marco.setCpf("987654321-1");
        marco.setSalario("5100");

        System.out.println(nico.getNome());
        System.out.println(nico.getBoniticacao());

        System.out.println(marco.getNome());
        System.out.println(marco.getBoniticacao());


    }
}
