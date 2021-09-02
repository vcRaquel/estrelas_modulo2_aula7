package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioLevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        int seletor = 1;
        Map<String,String> alunos = new HashMap<>();



        while (seletor >0 && seletor != 3){
            System.out.println("Gostaria de cadastrar um aluno?");
            System.out.println("Digite 1 para sim, 2 remover e 3 para encerrar o programa e sair");
            seletor = leitor.nextInt();
            switch (seletor){
                case 1:
                    System.out.print("Favor digitar o e-mail do aluno: ");
                    String email = leitor.next();
                    System.out.print("Favor digitar o nome e o telefone do aluno de acordo com o modelo: ");
                    System.out.print("Nome do Aluno; telefone");
                    String aluno = leitor2.nextLine();
                    alunos.put(email,aluno);
                    break;
                case 2:
                    System.out.println("Favor digitar o e-mail do aluno a ser removido: ");
                    email = leitor.next();
                    alunos.remove(email);
                    break;
            }
        }

        System.out.println("Obrigado por usar o programa!");
        System.out.println("A lista de alunos cadastrados até o momento é: " + alunos);






    }
}
