package Collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPerguntasCrime {
    public static void main(String[] args) {

    /* Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Responta as perguntas sobre o crime: ");
        System.out.println("Telefonou para a vítima?");
        String resposta = scan.nextLine();
        respostas.add(resposta);
        System.out.println("Esteve no local do crime?");
        resposta = scan.nextLine();
        respostas.add(resposta);
        System.out.println("Mora perto da vítima?");
        resposta = scan.nextLine();
        respostas.add(resposta);
        System.out.println("Devia para a vítima?");
        resposta = scan.nextLine();
        respostas.add(resposta);
        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.nextLine();
        respostas.add(resposta);

        int respostasPositivas = 0;
        for (String s : respostas) {
            if (s.equalsIgnoreCase("Sim") | s.equalsIgnoreCase("S")) {
                respostasPositivas++;
            }
        }
        switch (respostasPositivas) {
            case 0, 1 -> System.out.println("Classificação Inocente");
            case 2 -> System.out.println("Classificação Suspeita");
            case 3, 4 -> System.out.println("Classificação Cumplice");
            case 5 -> System.out.println("Classificação Assassina");
            default -> System.out.println("Respostas inválidas!");
        }
    }
}

