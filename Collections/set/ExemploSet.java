package Collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Notas: " + notas);

        System.out.println("Confira se a nota 5,0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota zero: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

            // notas.removeIf(next -> next < 7);
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram inseridas: ");
        Set <Double> notas2 = new LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Exclua todo o conjunto notas 2!");
        notas2.clear();
        System.out.println("Confira se o conjunto notas 2 está vazio: " +  notas2.isEmpty());
    }
}