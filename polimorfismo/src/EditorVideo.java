import java.math.BigDecimal;

public class EditorVideo extends Funcionario{

    public BigDecimal getBoniticacao() {
        BigDecimal teste = super.getBoniticacao().add(new BigDecimal("100"));
        //super -> Quando o atributo/metodo vem da Super Classe
        System.out.printf("Bonificação do editor de vídeo: %.2f\n", teste.doubleValue());
        return teste;
    }
}
