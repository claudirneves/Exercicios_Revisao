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
public class Exercicio1Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte minhaIdade = 29;
        String meuNome = "Claudir Neves";
        float meuPeso = 68f;
        char tipoSanguineo = '+';
        String meuAniversario = "19/02";
        byte numeroCalco = 42;
        String casado = "Não";
        System.out.println("Minha Iddade é: " + idade(minhaIdade));
        System.out.println("Meu Nome é: " + nome(meuNome));
        System.out.println("Meu Peso é: " + peso(meuPeso));
        System.out.println("Meu Tipo Sanguíneo é: " + rh(tipoSanguineo));
        System.out.println("Meu Aniversário é: " + niver(meuAniversario));
        System.out.println("Eu Calço: " + calco(numeroCalco));
        System.out.println("Casado: " + solteiro(casado));
    }

    public static byte idade(byte minhaIdade) {
        return minhaIdade;
    }

    public static String nome(String meuNome) {
        return meuNome;
    }

    public static float peso(float meuPeso) {
        return meuPeso;
    }

    public static String niver(String meuAniversario) {
        return meuAniversario;
    }

    public static byte calco(byte numeroCalco) {
        return numeroCalco;
    }

    public static String solteiro(String casado) {
        return casado;
    }

    public static char rh(char tipoSanguineo) {
        return tipoSanguineo;
    }

}
