package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperaturaMedia {
    public static void main(String[] args) {

        /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int i = 0;
        while (i < 6) {
            System.out.println("Digite uma temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            i++;
        }

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double temp = iterator.next();
            soma += temp;
        }
        double media = soma/temperaturas.size();
        System.out.println("Temperaturas Semestral: " + temperaturas);
        System.out.printf("Média temperaturas Semestral: %.1f ºC\n", media);
        System.out.println("----------");

        System.out.println("Temperaturas a cima da média: ");
        for ( Double temp : temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0 -> System.out.printf("1 - janeiro: %.1f\n ", temp);
                    case 1 -> System.out.println((index + 1) + " - FEVEREIRO: " + temp + " ºC");
                    case 2 -> System.out.println((index + 1) + " - MARÇO: " + temp + " ºC");
                    case 3 -> System.out.println((index + 1) + " - ABRIL: " + temp + " ºC");
                    case 4 -> System.out.println((index + 1) + " - MAIO: " + temp + " ºC");
                    case 5 -> System.out.println((index + 1) + " - JUNHO: " + temp + " ºC");
                    default -> {
                    }
                }
            }
        }
    }
}
