
import java.util.Scanner;

public class AnaliseInvestimento extends ContaCorrente {

    private double quantiaInvestida;

    public double analiseInvestimento(double valor, double saldo) {

        System.out.println("Seu saldo aumentou! Que tal investir? Responda:\n1-sim\n2-não");
        Scanner leia = new Scanner(System.in);
        int resp = leia.nextInt();
        switch (resp) {
            case 1:
                double valorAInvestir = valor;//quantiaInvestida
                saldo -= valorAInvestir;
                quantiaInvestida += valorAInvestir;
                return valorAInvestir;
            case 2:
                return 0;
            default:
                analiseInvestimento(valor, saldo);
                break;
        }
        return 0;
    }

}
