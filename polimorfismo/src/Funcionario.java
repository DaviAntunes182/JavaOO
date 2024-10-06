import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String cpf;
    private BigDecimal salario;

    public Funcionario() {
    }

    public BigDecimal getBoniticacao(){
        return this.salario.multiply(new BigDecimal("0.15"));
    }

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
