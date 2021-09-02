package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Faça um Programa que leia 20 números e armazene-os numa lista.
// Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar.
// Imprima as três listas.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numeroLido =0;
        List<Double>numeros = new ArrayList<>();
        List<Double>pares = new ArrayList<>();
        List<Double>impares = new ArrayList<>();

        int quantidadeNumeros = 20;
        int contador = 1;

        for (contador = 1; contador <= quantidadeNumeros; contador += 1){
            System.out.println("Digite o " + contador + " número: ");
            numeroLido = leitor.nextDouble();
            numeros.add(numeroLido);
            if (numeroLido %2 == 0){
                pares.add(numeroLido);
            }else{
                impares.add(numeroLido);
            }
        }
        System.out.println("Os números digitados foram: " + numeros);
        System.out.println("Dos números digitados, estes são os números ímpares: " + impares);
        System.out.println("Dos números digitados, estes são os números pares: " + pares);

    }
}
