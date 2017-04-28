/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosrevisao;

/**
 *
 * @author Claudir
 */
public class Exercicio13Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimedeFutebol time = new TimedeFutebol();
         time.Nome("Corinthians");
        time.Patrimonio(1.7);
         time.Presidente("Roberto de Andrade");
         time.Tecnico("Fábio Carille");
                
           System.out.print("Qual é o seu time? ");
           System.out.print(time.getNome());
           
           System.out.print("\nQual o valor do Patrimônio? ");
           System.out.print(time.getPatrimonio()+" Bilhões");
           
           System.out.print("\nQual o Presidente? ");
           System.out.print(time.getPresidente());
           
           System.out.print("\nQuem é o técnico? ");
           System.out.print(time.getTecnico());
    }
    
}
