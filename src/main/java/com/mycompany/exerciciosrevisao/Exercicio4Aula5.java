/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciosrevisao;

import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class Exercicio4Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro: ");
        Scanner numero = new Scanner(System.in);
        num = numero.nextInt();
        if (num % 2 == 0) {
            System.out.println("Numero digitado é Par!");
        } else {
            System.out.println("Numero digitado é Impar!");
        }
    }
    
}
