package javabasico.desafios;

import java.util.Scanner;

public class BuscaSequencial {
    static int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
    static int index = 0;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int condicao = buscarElemento(numero);

        if (condicao == 1){
            System.out.printf("Achei %d na posicao %d", numero,index);
        } else {
            System.out.printf("Numero %d nao encontrado!", numero);
        }

    }

    public static int buscarElemento(int numero){
        int resultado = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == numero) {
                index = i;
                resultado = 1;
            }
        }
        return resultado;
    }
}