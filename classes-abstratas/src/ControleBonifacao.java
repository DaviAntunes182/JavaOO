import java.math.BigDecimal;

public class ControleBonifacao {
    private BigDecimal soma = new BigDecimal("0");
// Este modo de fazer código é ruim pois se repete muito
//    public void registra(Gerente gerente){
//        BigDecimal boni = gerente.getBoniticacao();
//        this.soma = this.soma.add(boni);
//    }
//    public void registra(Funcionario funcionario){
//        BigDecimal boni = funcionario.getBoniticacao();
//        this.soma = this.soma.add(boni);
//    }
//    public void registra(EditorVideo editorVideo){
//        BigDecimal boni = editorVideo.getBoniticacao();
//        this.soma = this.soma.add(boni);
//    } O modo correto seria este abaixo

    //Como as classes herdam de funcionario, elas também podem usar o método
    public void registra(Funcionario funcionario){
        //Cada tipo irá utilizar seu calculo específico
        BigDecimal boni = funcionario.getBoniticacao();
        this.soma = this.soma.add(boni);
    }

    public BigDecimal getSoma() {
        return soma;
    }
}
