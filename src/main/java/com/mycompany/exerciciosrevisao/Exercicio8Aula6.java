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
public class Exercicio8Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String binario;
        System.out.printf("Digite um número inteiro: ");
        Scanner numeroDigitado = new Scanner(System.in);
        numero = numeroDigitado.nextInt();
        binario = Integer.toString(numero,2);
        System.out.println(numero+" em Binário é: "+binario);
    }
    
}
