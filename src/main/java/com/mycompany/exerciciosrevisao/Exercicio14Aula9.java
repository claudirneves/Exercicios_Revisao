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
public class Exercicio14Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
         aluno.recebeNome("Claudir Neves");
         aluno.recebeRA(2016031400);
         aluno.recebeCurso("TADS");
         aluno.recebeDataNascimento("19/02/1988");
         aluno.recebeEndereco("Rua José Luiz Pereira");
         
         System.out.println("Qual é seu RA?");
         System.out.println(aluno.passaRA());
         System.out.println("Qual seu Nome?");
         System.out.println(aluno.passarNome());
         System.out.println("Qual seu Curso?");
         System.out.println(aluno.passarCurso());
         System.out.println("Qual seu Endereço?");
         System.out.println(aluno.passarEndereco());
   }
    
}
