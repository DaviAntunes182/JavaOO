import java.math.BigDecimal;

public abstract class Conta {
    private BigDecimal saldo = new BigDecimal("0");
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;



    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        Conta.total++;
        System.out.println("Criando uma conta: "+ this.numero);
    }

    public abstract void depositar(String valor);

    public String sacar(String valor){
        BigDecimal convertido = new BigDecimal(valor);

        if(this.getSaldo().doubleValue() > convertido.doubleValue()){
            this.setSaldo(this.saldo.subtract(convertido));
            return "Operação realizada, valor sacado: " + valor + "\nSaldo atual : " + this.saldo;
        }
        else{
            return "Saldo insuficiente para a operação";
        }
    }

    public boolean tranferir(Conta destino, String valor){
        BigDecimal convertido = new BigDecimal(valor);
        if(convertido.doubleValue() > 0){
            if(this.getSaldo().doubleValue() > convertido.doubleValue()) {
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

    //Getters & Setters
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        if(saldo.doubleValue() < 0){
            System.out.println("Uma conta não pode ser iniciada com valor negativo");
            return;
        }
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("O valor da agência não pode ser negativo");
            return;
        }
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("O número não pode ser negativo ou 0");
            return;
        }
        this.numero = numero;
    }
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
