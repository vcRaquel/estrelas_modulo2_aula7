package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioLevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int seletor;
        Map<String, String> alunos = new HashMap<>();

        System.out.println("Favor digitar o e-mail do aluno: ");
        String email = leitor.nextLine();
        System.out.println("Favor digitar o nome e o telefone do aluno de acordo com o modelo: ");
        System.out.println("Nome do Aluno; telefone");
        String aluno = leitor.nextLine();
        alunos.put(email, aluno);


        System.out.println(alunos);


    }
}
