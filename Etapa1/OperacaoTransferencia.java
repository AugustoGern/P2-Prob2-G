
import java.util.Date;

/**
 *
 * @author agern
 */
public class OperacaoTransferencia extends Operacao{
    
    private ContaCorrente contraPartida;

    public OperacaoTransferencia(ContaCorrente contraPartida, double valor, double saldoAnterior, TipoOperacao tipo, ContaCorrente conta, Date data) {
        super(valor, saldoAnterior, tipo, conta, data);
        this.contraPartida = contraPartida;
    }

    

    public ContaCorrente getContraPartida() {
        return contraPartida;
    }

    public void setContraPartida(ContaCorrente contraPartida) {
        this.contraPartida = contraPartida;
    }
    
}
