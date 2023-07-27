package javabasico.loops;

import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 0;
        int numeroMaior = 0;
        int soma = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > numeroMaior) numeroMaior = numero;
            soma += numero;

            i++;
        } while (i < 5);
        System.out.println("Maior: " + numeroMaior);
        System.out.println("Media: " + (soma/5));
    }
}