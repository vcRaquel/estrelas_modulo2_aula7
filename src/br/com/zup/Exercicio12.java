package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeNumeros = 5;
        int soma = 0;
        int multiplicacao = 1;
        int numeroLido = 0;

        List<Integer> numeros = new ArrayList<>();

        for (int contador = 1; contador <= quantidadeNumeros; contador += 1){
            System.out.println("Digite o " + contador + " número: ");
            numeroLido = leitor.nextInt();
            numeros.add(numeroLido);
            soma += numeroLido;
            multiplicacao *= numeroLido;
        }
        System.out.println("Os números digitados foram: " + numeros);
        System.out.println("A soma desses números é igual a: " + soma);
        System.out.println("A multiplicação desses números é igual a: " + multiplicacao);
    }
}
