package br.com.zup;

import java.util.Scanner;
//Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
// Um número primo é aquele que é divisível apenas por um e por ele mesmo.
// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
public class Exercicio4 {
    public static void main(String[] args) {
        //Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
        // Um número primo é aquele que é divisível apenas por um e por ele mesmo.
        // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int primo = 0;

        System.out.println("Verificador de números primos");
        System.out.println("Digite um número inteiro: ");
        numero = leitor.nextInt();
        if (numero < 0) {
            numero *= -1;
        }

        for (int contador = 1; contador <= numero; contador++) {
            if (numero % contador == 0) {
                primo += 1;
            }
        }
        if (primo == 2) {
            System.out.println("O número " + numero + " é um número primo");
        } else {
            System.out.println("O número " + numero + " não é um número primo");
        }


    }
}
