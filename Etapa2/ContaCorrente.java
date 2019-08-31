
import static java.lang.System.console;
import java.util.Date;
import java.util.Scanner;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private OperacaoTransferencia operacao = null;
    private Financiar fin = new Financiar();

    public double sacar(double valor) {
        if (valor > saldo) {
            saldo += fin.financiamento(valor, saldo);
            if (saldo >= valor) {//se, depois da opção do financiamento tiver salfo(pq pode ter retornado 0 ou o valor que falta), fazer
                operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.SAIDA, this, new Date());
                return saldo -= operacao.getValor();
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        return saldo;
    }

    public double depositar(double valor) {
        operacao = new OperacaoTransferencia(null, valor, saldo, TipoOperacao.ENTRADA, this, new Date());
        return saldo += operacao.getValor();
    }

    public double transferir(ContaCorrente contaDestino, double valor) {
        if (valor > saldo) {
            saldo += fin.financiamento(valor, saldo);
            if (saldo >= valor) {//se, depois da opção do financiamento tiver salfo(pq pode ter retornado 0 ou o valor que falta), fazer
                operacao = new OperacaoTransferencia(contaDestino, valor, saldo, TipoOperacao.SAIDA, this, new Date());
                return saldo -= operacao.getValor();
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        return saldo;
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
