import java.math.BigDecimal;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private BigDecimal salario;

    public Funcionario() {
    }

    //Metodoso que não possuem corpo e os herdeiros devem implementá-lo
    public abstract BigDecimal getBoniticacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = new BigDecimal(salario);
    }
}
