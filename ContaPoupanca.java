public class ContaPoupanca implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        registrarOperacao("Depósito", valor);
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        registrarOperacao("Saque", valor);
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}

