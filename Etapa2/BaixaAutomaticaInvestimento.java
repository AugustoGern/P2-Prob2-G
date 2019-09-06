package prob2;

import java.util.Observable;

public class BaixaAutomaticaInvestimento implements Servico {

    private Observable contaCorrente;

    public BaixaAutomaticaInvestimento(Observable contaCorrente) {
        this.contaCorrente = contaCorrente;
        contaCorrente.addObserver(this);
    }

    @Override
    public void executar(Operacao op) {
        System.out.println("baixa automatica no valor xxxxxx realizada");
    }

    @Override
    public void update(Observable obj, Object arg) {
        ContaCorrente c = (ContaCorrente) obj;
        System.out.println("Operacao realizada: baixa automatica");
    }

}
