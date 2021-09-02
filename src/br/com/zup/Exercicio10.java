package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        int contador = 1;
        int quantidadeNotas = 4;
        double nota = 0;
        double somaNota = 0;

        for (contador = 1; contador <= quantidadeNotas; contador += 1) {
            System.out.println("Digite o valor da " + contador + " nota: ");
            nota = leitor.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
                somaNota += nota;
            } else {
                System.out.println("Digite uma nota válida");
            }
        }

        double media = somaNota / quantidadeNotas;
        System.out.println("Os valores das notas foram: " + notas);
//        System.out.println("A média das notas é igual a: " + media);
        if (media >= 7 && media < 10) {
            System.out.println("Parabéns, você foi aprovado com a média: " + media);
        } else if (media == 10) {
            System.out.println("Parabéns! Você foi aprovado com distinção! Sua média foi: " + media);
        } else {
            System.out.println("Infelizmente a sua média de " + media + " não foi suficiente para aprovação.");
            System.out.println("Você está em recuperação");
        }
    }
}
