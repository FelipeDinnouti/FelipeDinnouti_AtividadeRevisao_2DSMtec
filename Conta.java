import java.util.ArrayList;

interface Conta {
    // Não terminei a funcionalidade de operacoes, variáveis em contexto de interface são static 
    //e portanto não posso declarar a lista de operações aqui caso queira que sejam únicas a cada objeto
    ArrayList<Operacao> operacoes = new ArrayList<Operacao>();

    default public void registrarOperacao(String tipo, double valor) {
        operacoes.add(new Operacao(tipo, valor));
    } 

    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}