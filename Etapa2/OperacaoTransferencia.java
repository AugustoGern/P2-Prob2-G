package prob2;

import java.util.Date;

public class OperacaoTransferencia extends Operacao {

    private ContaCorrente contraPartida;

    public OperacaoTransferencia(ContaCorrente contraPartida, double valor, double saldoAnterior, TipoOperacao tipo, ContaCorrente conta) {
        super(valor, saldoAnterior, tipo, conta);
        this.contraPartida = contraPartida;
    }

    public ContaCorrente getContraPartida() {
        return contraPartida;
    }

    public void setContraPartida(ContaCorrente contraPartida) {
        this.contraPartida = contraPartida;
    }

}
