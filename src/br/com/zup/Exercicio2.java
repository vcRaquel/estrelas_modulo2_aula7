package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao menu de dias da semana. Escolha um número de acordo com as opções abaixo: ");
        System.out.println("Digite o número 1 para selecionar Domingo");
        System.out.println("Digite o número 2 para selecionar Segunda");
        System.out.println("Digite o número 3 para selecionar Terça");
        System.out.println("Digite o número 4 para selecionar Quarta");
        System.out.println("Digite o número 5 para selecionar Quinta");
        System.out.println("Digite o número 6 para selecionar Sexta");
        System.out.println("Digite o número 7 para selecionar Sábado");
        System.out.println();
        System.out.println("Qual a opção desejada? ");
        int numeroLido = leitor.nextInt();

       // if (numeroLido > 0 && numeroLido <= 7){
            switch (numeroLido){
                case 1 :
                    System.out.println("Você escolheu a Domingo");
                    break;
                case 2 :
                    System.out.println("Você escolheu a Segunda");
                    break;
                case 3 :
                    System.out.println("Você escolheu a Terça");
                    break;
                case 4 :
                    System.out.println("Você escolheu a Quarta");
                    break;
                case 5 :
                    System.out.println("Você escolheu a Quinta");
                    break;
                case 6 :
                    System.out.println("Você escolheu a Sexta");
                    break;
                case 7 :
                    System.out.println("Você escolheu a Sábado");
                    break;
                default:
                    System.out.println("Digite uma opção válida");

            }
       // }

    }
}
