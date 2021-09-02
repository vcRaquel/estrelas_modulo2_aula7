package br.com.zup;

import java.util.Scanner;
//Faça um programa que pergunte o preço de três produtos
// e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeProdutos = 3;
        int contador;
        double preco = 0;
        double menorValor = 0;

        for (contador = 1; contador <= quantidadeProdutos; contador += 1) {
            System.out.println(" Por favor digite o valor do produto " + contador);
            preco = leitor.nextDouble();

            if (contador == 1) {
                menorValor = preco;
            } else if (contador > 1 && preco < menorValor) {
                menorValor = preco;
            }
        }
        System.out.println("O menor valor foi o de: R$ " + menorValor);
    }
}
