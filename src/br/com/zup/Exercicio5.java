package br.com.zup;

import java.util.Scanner;
//Faça um programa que leia 5 números e informe o maior número.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeNumeros = 5;
        int contador;
        double numeroLido = 0;
        double maiorValor = 0;

        for (contador = 1; contador <= quantidadeNumeros; contador += 1) {

            System.out.println(" Por favor digite o " + contador + " número" );
            numeroLido = leitor.nextDouble();

            if (contador == 1) {
                maiorValor = numeroLido;
            } else if (contador > 1 && numeroLido > maiorValor) {
                maiorValor = numeroLido;
            }
        }
        System.out.println("O maior número digitado foi: " + maiorValor);
    }
}
