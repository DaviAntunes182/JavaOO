import java.math.BigDecimal;

public class Conta {
    BigDecimal saldo = new BigDecimal("0");
    int agencia;
    int numero;
    String titular;

    public void depositar(String valor){
        BigDecimal convertido = new BigDecimal(valor);
        if(convertido.doubleValue() > 0) {
            this.saldo = this.saldo.add(convertido);
            System.out.printf("""
                    Valor depositado: %.2f
                    Saldo atual: %.2f
                    """, convertido, this.saldo);

        }else{
            System.out.println("Não tem como depositar um valor negativo");
        }
    }
    public String sacar(String valor){
        BigDecimal convertido = new BigDecimal(valor);

        if(this.saldo.doubleValue() > convertido.doubleValue()){
            this.saldo = this.saldo.subtract(convertido);
            return "Operação realizada, valor sacado: " + valor + "\nSaldo atual : " + this.saldo;
        }
        else{
            return "Saldo insuficiente para a operação";
        }
    }

    public boolean tranferir(Conta destino, String valor){
        BigDecimal convertido = new BigDecimal(valor);
        if(convertido.doubleValue() > 0){
            if(this.saldo.doubleValue() > convertido.doubleValue()) {
                this.sacar(valor);
                destino.depositar(valor);
                return true;
            }else{
                return false;
            }
        }else{

            return false;
        }
    }
}
