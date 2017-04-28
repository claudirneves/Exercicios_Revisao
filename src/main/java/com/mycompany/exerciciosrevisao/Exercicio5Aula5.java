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
public class Exercicio5Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, resultado = 0;
        char operacao;
        System.out.println("Digite o primeiro número!");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextDouble();

        System.out.println("Informe a operção que deseja realizar");
        Scanner opera = new Scanner(System.in);
        operacao = opera.next().charAt(0);
        primeiro:
        do {
            System.out.println("Digite o segundo número!");
            Scanner numero2 = new Scanner(System.in);
            num2 = numero2.nextDouble();
            if (operacao == '/' && num2 == 0) {
                System.out.println("Não existe divisão por zero!");
                continue primeiro;
            }
        } while (operacao == '/' && num2 == 0);
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;

        }
        System.out.println("Resultado é: " + resultado);
    }
    
}
