/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class teste {

    public teste() {
    }

    /**
     * Test of sacar method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        ContaCorrente instance = new ContaCorrente();
        instance.setSaldo(20.0);
        double result = instance.sacar(5.0);
        assertEquals(15, result, 0.0);
    }

    /**
     * Test of depositar method, of class ContaCorrente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        Cliente cliente = new ClientePessoaFisica("Pedrinho", "33236098", "997609003", "111.359.267-81");
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(10.00);
        // cliente.addContaCorrente(conta);
        conta.depositar(50.00);
        Double result = conta.getSaldo();
        assertEquals(60.0, result, 0.0);
    }

    /**
     * Test of transferir method, of class ContaCorrente.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        ContaCorrente contaDestino = null;
        ContaCorrente instance = new ContaCorrente();
        instance.setSaldo(20.0);
        double result = instance.transferir(contaDestino, 10.0);
        assertEquals(10.0, result, 0.0);
    }

}
