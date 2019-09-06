package prob2;

import java.util.Observable;

public class NotificacaoOperacao implements Servico {

    private Observable contaCorrente;

    public NotificacaoOperacao(Observable contaCorrente) {
        this.contaCorrente = contaCorrente;
        contaCorrente.addObserver(this);
    }

    @Override
    public void executar(Operacao op) {
        System.out.println("voce esta sendo notificado de uma operacao tal");
    }

    @Override
    public void update(Observable obj, Object arg) {
        ContaCorrente c = (ContaCorrente) obj;
        System.out.println("operacao realizada: notificao de operacao");
    }

}
