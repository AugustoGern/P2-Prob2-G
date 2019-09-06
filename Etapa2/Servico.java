package prob2;

import java.util.Observer;

public interface Servico extends Observer {

    void executar(Operacao op);

}
