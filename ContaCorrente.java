public class ContaCorrente implements Conta {
    private double saldo;
    private double taxaOp = 0.45;

    
    @Override 
    public void depositar(double valor) {
        registrarOperacao("Depósito", valor);
        this.saldo += valor - taxaOp;
    }

    @Override
    public void sacar(double valor) {
        registrarOperacao("Saque", valor);
        this.saldo -= valor + taxaOp;
    } 

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta Corrent - Saldo: " + this.getSaldo();
    }

}
