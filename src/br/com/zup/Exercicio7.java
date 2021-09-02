package br.com.zup;

import java.util.Scanner;
//Faça um programa que receba dois números inteiros
// e gere os números inteiros que estão no intervalo compreendido por eles.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroInicial;
        int numeroFinal;

        System.out.println("Por favor digite um número inicial: ");
        numeroInicial = leitor.nextInt();
        System.out.println("Por favor digite um número final: ");
        numeroFinal = leitor.nextInt();

        if (numeroFinal >= numeroInicial){
            for (int contador = numeroInicial; contador <= numeroFinal; contador++) {
                System.out.println(contador);
            }
        } else{
            System.out.println("Por favor digite um intervalo válido");
        }



    }
}
