package br.com.zup;
//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class Exercicio6 {
    public static void main(String[] args) {

        for (int contador = 1; contador <= 50; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }
    }
}
