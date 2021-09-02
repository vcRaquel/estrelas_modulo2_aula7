package br.com.zup;
//Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador =1;
        int quantidadeNumeros = 5;
        int valorLido =0;

        while (contador <= quantidadeNumeros){
            System.out.println("Por favor digite o " + contador + " número: ");
            valorLido = leitor.nextInt();

            if (valorLido>=0){
                numeros.add(valorLido);
                contador += 1;
            }else{
                System.out.println("Valor inválido");
            }
        }
        System.out.println(numeros);
    }
}
