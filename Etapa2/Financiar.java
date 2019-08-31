
import java.util.Scanner;

public class Financiar extends ContaCorrente {

    private double quantiaFinanciada;

    public double financiamento(double valor, double saldo) {
        System.out.println("Realizar financiamento no valor que falta? Responda: \n1 - sim \n2- não");
        Scanner leia = new Scanner(System.in);
        int resp = leia.nextInt();
        switch (resp) {
            case 1:
                double credito = valor - saldo; //pega o valor que falta pra poder fazer a operação, e esse valor será o credito
                saldo += credito;
                quantiaFinanciada += credito;//adiciona o valor na quantia que ja estpa financiada
                return credito;
            case 2:
                return 0;
            default:
                financiamento(valor, saldo);
                break;
        }
        return 0;
    }

}
