package br.com.zup;

import java.util.Scanner;

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
