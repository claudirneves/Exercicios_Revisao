/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosrevisao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class BancoAula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroConta;
        
        int quantConta, cont = 0;
        double saldoConta, limiteConta;
        String statusConta;
        Object[]  movimento = {"Excluir", "Saque"};
        System.out.println("Quantas contas deseja cadastrar?");
        Scanner conta = new Scanner(System.in);
        quantConta = conta.nextInt();
        ContaCorrente[] vetorContas = new ContaCorrente[quantConta];
        while (cont < quantConta) {
            ContaCorrente novaConta = new ContaCorrente();
            System.out.println("Informe o número da conta corrente");
            Scanner cc = new Scanner(System.in);
            numeroConta = cc.nextInt();
            novaConta.recebeNumero(numeroConta);
            
            System.out.println("Informe o saldo da conta corrente:");
            saldoConta = cc.nextDouble();
            novaConta.recebeSaldo(saldoConta);
            
            System.out.println("Informe se a conta é especial:");
            statusConta = cc.next();
            novaConta.recebeStatus(statusConta);
            
            System.out.println("Informe o limite da conta: ");
            limiteConta = cc.nextDouble();
            novaConta.recebeLimite(limiteConta);
            vetorContas[cont] = novaConta;
            cont++;
        }
        for (int i = 0; i < cont; i++) {
            System.out.println("Número da conta: "+vetorContas[i].passaNumero());
            System.out.println("Saldo da conta: "+vetorContas[i].passaSaldo());
            System.out.println("A conta especial: "+ vetorContas[i].passaStatus());
            System.out.println("Limente da conta: " + vetorContas[i].passaLimite());
        }
        JOptionPane.showInputDialog(null,"O que deseja fazer?", "Opções",
                JOptionPane.INFORMATION_MESSAGE,null, movimento, movimento[0]);
        //Banco.addConta(novaConta);

        // ContaCorrente teste = Banco.retornaConta(0);
        // System.out.println(teste.passaNumero());
        
       
    }
    /* public static int excluirConta(){
        int numeroExcluir;
        String numeroInformado;
       numeroInformado= JOptionPane.showInputDialog(null,"Informe o número da conta a ser excluída");
        numeroExcluir = Integer.parseInt(numeroInformado);
        
     }*/
     


}
