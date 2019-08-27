
import java.util.Date;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private OperacaoTransferencia operacao = null;

    public double sacar(double valor) {
        operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.SAIDA, this, new Date());
        return saldo -= operacao.getValor();
    }

    public double depositar(double valor) {
        operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.ENTRADA, this, new Date());
        return saldo += operacao.getValor();
    }

    public double transferir(ContaCorrente contaDestino, double valor) {
        operacao = new OperacaoTransferencia(contaDestino, valor, saldo, TipoOperacao.SAIDA, this, new Date());
        return saldo -= operacao.getValor();
    }

    private double receber(ContaCorrente origem, double valor) {
        operacao = new OperacaoTransferencia(origem, valor, saldo, TipoOperacao.ENTRADA, this, new Date());
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

}
