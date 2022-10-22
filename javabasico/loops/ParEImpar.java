package javabasico.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        int i = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            i++;
        } while (i < quantidadeNumeros);
        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Impar: " + quantidadeImpares);
    }
}
