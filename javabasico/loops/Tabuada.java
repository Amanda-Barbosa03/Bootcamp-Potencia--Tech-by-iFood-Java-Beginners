package javabasico.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        if (tabuada < 0 || tabuada > 10) {
            System.out.println("Digite um numero inteiro entre 1 e 10: ");
            tabuada = scan.nextInt();
        }

        System.out.printf("Tabuada de %d:\n", tabuada);

        for (int i = 1; i < 11; i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));
        }
    }
}
