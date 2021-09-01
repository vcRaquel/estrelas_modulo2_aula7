package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int contadorExibir = 9; //por conta do número de índices que começa a contar do 0
        int finalExibir = 0;
        int totalNumeros = 10;
        int valorLido = 0;

        while (contador<=totalNumeros){
            System.out.println("Digite o " + contador + " número: ");
            valorLido = leitor.nextInt();
            numeros.add(valorLido);
            contador += 1;
        }
        System.out.println("Os números foram digitados na seguinte ordem: " + numeros);

        for (contadorExibir = 9; contadorExibir >= finalExibir; contadorExibir -= 1){
            System.out.println(numeros.get(contadorExibir));
        }

    }
}
