/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosrevisao;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Banco {
    private static ContaCorrente[] vetorContas = new ContaCorrente[5];
    private static int count;
    
    public static void addConta(ContaCorrente conta) {
        vetorContas[count] = conta;
        count++;
    }
    
    public static ContaCorrente retornaConta(int i) {
        return vetorContas[i];
    }
    
    
    public boolean excluirConta(ContaCorrente conta){
        //Buscar a conta dentro do vetor;
        int numeroExcluir;
        String numeroInformado;
       numeroInformado= JOptionPane.showInputDialog(null,"Informe o número da conta a ser excluída");
        numeroExcluir = Integer.parseInt(numeroInformado);
       // for(int i=0;i<vetorContas.length;i++){
          
//Return false
        
        //vetorContas[indice] = null;
        return true;
        }
   
}
