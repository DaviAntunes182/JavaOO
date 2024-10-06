public class Principal {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        Gerente marco = new Gerente();

        nico.setNome("Nico Steppat");
        nico.setCpf("123456789-9");
        nico.setSalario("2600.00");

        marco.setNome("Marco");
        marco.setCpf("987654321-1");
        marco.setSalario("5000");

        System.out.println(nico.getNome());
        System.out.println(nico.getBoniticacao());

        System.out.println(marco.getNome());
        System.out.println(marco.getBoniticacao());


    }
}
