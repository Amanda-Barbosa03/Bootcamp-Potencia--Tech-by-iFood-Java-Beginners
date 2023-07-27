package javabasico.desafios;

import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int multiploA = 0;
        int somaMultiplos = 0;
        int j = 0;

        //Retorna o valor da soma de todos múltiplos de "A" até o seu limite "N".
        while (multiploA < N) {
            multiploA = A * j;
            somaMultiplos += multiploA;
            j++;
        }
        System.out.println(somaMultiplos);
    }
}