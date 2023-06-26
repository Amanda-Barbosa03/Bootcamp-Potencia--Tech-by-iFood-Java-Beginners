package Collections.map;

import java.util.*;

/*Faça um programa que simule um lançamento de dados.
Lance o dado N vezes e armazene.
Depois, mostre quants vezes cada valor for inserido */

public class LancamentoDado {
    public static void main(String[] args) {
        int quantidadeLancamentos = 20;

        System.out.println("Lançamento do dado...");
        Map<Integer,Integer> lancamentosDado = new TreeMap<>();
        for (Integer i = 0; i < quantidadeLancamentos; i++) {
            Integer numero = (int) (Math.random() * 6) + 1;
            lancamentosDado.put(i + 1,numero);
        }

        System.out.println("Nº do lançamento " + " Resultado");
        for (Map.Entry<Integer, Integer> entry : lancamentosDado.entrySet()) {
            System.out.printf("%5d %10d\n", entry.getKey(), entry.getValue());
        }

        Map<Integer, Integer> repeticaoResultados = new HashMap<>();
        for (Map.Entry<Integer, Integer> resultado : lancamentosDado.entrySet()) {
            if (repeticaoResultados.containsKey(resultado.getValue()))
                repeticaoResultados.put(resultado.getValue(), (repeticaoResultados.get(resultado.getValue()) + 1));
            else repeticaoResultados.put(resultado.getValue(), 1);

        }
        System.out.println("\nAputação dos resultados...");
        System.out.println("Valor " + " Quantidade de resultados repetidos");
        for (Map.Entry<Integer, Integer> entry : repeticaoResultados.entrySet()) {
            System.out.printf("%3d %15d\n", entry.getKey(), entry.getValue());
        }
    }
}


  
