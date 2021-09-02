package br.com.zup;

import java.util.Scanner;
//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual número ele deseja ver a tabuada.
// A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 x 1 = 5
//5 x 2 = 10
//[...]
//5 x 10 = 50
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 1;
        int multiplicandoLimite = 10;


        System.out.println("Qual tabuada gostaria de consultar? ");
        int multiplicador = leitor.nextInt();
        int produto = 0;

        for (contador = 1; contador <= multiplicandoLimite; contador += 1){
            produto = multiplicador * contador;
            System.out.println(multiplicador + " x " + contador + " = " + produto);
        }


    }
}
