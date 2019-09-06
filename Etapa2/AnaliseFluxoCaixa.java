package prob2;

import java.util.Observable;

public class AnaliseFluxoCaixa implements Servico {

    private Observable contaCorrente;

    public AnaliseFluxoCaixa(Observable contaCorrente) {
        this.contaCorrente = contaCorrente;
        contaCorrente.addObserver(this);
    }

    @Override
    public void executar(Operacao op) {
        System.out.println("seu caixa esta negativo segundo nosso programa de analise de fluxo de caixa");
    }

    @Override
    public void update(Observable obj, Object arg) {
        ContaCorrente c = (ContaCorrente) obj;
        System.out.println("operacao realizada: analise de fluxo de caaixa");
    }

}
