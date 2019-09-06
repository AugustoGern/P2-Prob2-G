package prob2;

import java.util.Observable;

public class ContaCorrente extends Observable {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private OperacaoTransferencia operacao = null;

    public double sacar(double valor, ContaCorrente conta) {
        operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.SAIDA, conta);
        setChanged();
        notifyObservers();
        return saldo -= operacao.getValor();
    }

    public double depositar(double valor, ContaCorrente conta) {
        operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.ENTRADA, conta);
        setChanged();
        notifyObservers();
        return saldo += operacao.getValor();
    }

    public double transferir(ContaCorrente contaDestino, double valor, ContaCorrente conta) {
        operacao = new OperacaoTransferencia(contaDestino, valor, saldo, TipoOperacao.SAIDA, conta);
        setChanged();
        notifyObservers();
        return saldo -= operacao.getValor();
    }

    private double receber(ContaCorrente origem, double valor, ContaCorrente conta) {
        operacao = new OperacaoTransferencia(origem, valor, saldo, TipoOperacao.ENTRADA, conta);
        setChanged();
        notifyObservers();
        return saldo += operacao.getValor();
    }

    /*
    getters e setters
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(1000);
        NotificacaoOperacao not = new NotificacaoOperacao(conta);
        BaixaAutomaticaInvestimento bax = new BaixaAutomaticaInvestimento(conta);
        AnaliseFluxoCaixa cax = new AnaliseFluxoCaixa(conta);

        conta.sacar(200, conta);

    }

}
