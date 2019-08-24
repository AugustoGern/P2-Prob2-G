/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agern
 */
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }

    /**
     * Test of sacar method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        ContaCorrente instance = new ContaCorrente();
        double expResult = 0.0;
        double result = instance.sacar(valor);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of depositar method, of class ContaCorrente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        Cliente cliente = new ClientePessoaFisica("Pedrinho","33236098", "997609003", "111.359.267-81");
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(10);
       // cliente.addContaCorrente(conta);
        conta.depositar(50.00);
        
        Double result = conta.getSaldo();
        assertEquals(60, result, 0);
        fail("SE FODEU");
    }

    /**
     * Test of transferir method, of class ContaCorrente.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        ContaCorrente contaDestino = null;
        double valor = 0.0;
        ContaCorrente instance = new ContaCorrente();
        double expResult = 0.0;
        double result = instance.transferir(contaDestino, valor);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getNumero method, of class ContaCorrente.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        ContaCorrente instance = new ContaCorrente();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class ContaCorrente.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        ContaCorrente instance = new ContaCorrente();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgencia method, of class ContaCorrente.
     */
    @Test
    public void testGetAgencia() {
        System.out.println("getAgencia");
        ContaCorrente instance = new ContaCorrente();
        int expResult = 0;
        int result = instance.getAgencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgencia method, of class ContaCorrente.
     */
    @Test
    public void testSetAgencia() {
        System.out.println("setAgencia");
        int agencia = 0;
        ContaCorrente instance = new ContaCorrente();
        instance.setAgencia(agencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class ContaCorrente.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ContaCorrente instance = new ContaCorrente();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ContaCorrente.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        ContaCorrente instance = new ContaCorrente();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class ContaCorrente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        ContaCorrente instance = new ContaCorrente();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class ContaCorrente.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        ContaCorrente instance = new ContaCorrente();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
