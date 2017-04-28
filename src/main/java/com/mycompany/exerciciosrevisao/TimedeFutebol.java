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
public class TimedeFutebol {
    private String nome;
     private String presidente;
     private String cores;
     private String jogadores;
     private String estadio;
     private String ct;
     private double patrimonio;
     private String titulos;
     private String tecnico;
     
     public String getNome(){
         return nome;
     }
     public String getPresidente(){
         return presidente;
     }
     public String getTecnico(){
         return tecnico;
     }
     public double getPatrimonio(){
         return patrimonio;
     }
     
     public void Nome (String nomeParametro){
         nome = nomeParametro;
     }
     void Patrimonio (double patrimonioParametro){
         patrimonio = patrimonioParametro;        
     }
     void Presidente (String presidenteParametro){
         presidente = presidenteParametro;
     }
     void Tecnico (String tecnicoParametro){
         tecnico = tecnicoParametro;
     }
}
