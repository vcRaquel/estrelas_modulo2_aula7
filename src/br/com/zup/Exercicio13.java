package br.com.zup;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double limitePeso = 50;
        double valorMulta = 4;
        double multa = 0;
        double peso = 0;
        double excesso = 0;

        System.out.println("Digite o peso dos peixes: ");
        peso = leitor.nextDouble();

        if (peso>limitePeso){
            excesso = peso - limitePeso;
            multa = valorMulta * excesso;
            System.out.println("Você pescou Kg" + excesso + " além do peso limite");
            System.out.println("Por isso irá pagar R$ " + multa + " de valor de multa, sendo R$ " + valorMulta + " por Kg em excesso.");
        } else{
            System.out.println("Você pescou dentro do limite permitido e está isento de multa.");
        }
    }
}
