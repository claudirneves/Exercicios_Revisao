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
public class Aluno {
     private long RA;
     private String nome;
     private String endereco;
     private String curso;
     private String dataNascimento;
     
     public long passaRA(){
         return RA;
 }
     public String passarNome(){
         return nome;
     }
     public String passarEndereco(){
         return endereco;
     }
     public String passarCurso(){
         return curso;
     }
     public String passarDataNascimento(){
         return dataNascimento;
     }
 
     void recebeNome(String nomeParametro) {
         nome = nomeParametro;
     }
     
     void recebeRA(int RaParametro){
         RA = RaParametro;
     }
     void recebeEndereco(String enderecoParametro){
         endereco = enderecoParametro;
     }
     void recebeCurso(String cursoParametro){
         curso = cursoParametro;
     }
     void recebeDataNascimento(String dataNascimentoParametro){
         dataNascimento = dataNascimentoParametro;
     }
}
