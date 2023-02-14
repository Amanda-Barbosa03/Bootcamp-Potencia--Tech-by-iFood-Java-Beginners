package Collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExercicioNotasLinkedList {
    // Resolva esses exercícios utilizando os métodos da implementação LinkedList:
    // System.out.println("Crie uma lista chamada notas2 " +
    // "e coloque todos os elementos da list Arraylist nessa nova lista: ");
    public static void main(String[] args) {
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println("Nova lista Notas: " + notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());

        notas2.removeFirst();
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " +  notas2.getFirst());

        System.out.println("Exiba a posição da nota 5.0: " + notas2.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas2.add(4, 8d);
        System.out.println(notas2);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas2.set(notas2.indexOf(5d), 6.0);
        System.out.println(notas2);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas2.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas2) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas2.get(2));
        System.out.println(notas2);

        System.out.println("Exiba a menor nota: " + Collections.min(notas2));

        System.out.println("Exiba a maior nota: " + Collections.max(notas2));

        Iterator<Double> iterator = notas2.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas2.size()));

        System.out.println("Remova a nota 0: ");
        notas2.remove(0d);
        System.out.println(notas2);

        System.out.println("Remova a nota da posição 0");
        notas2.remove(0);
        System.out.println(notas2);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        notas2.removeIf( i -> i < 7);
        System.out.println(notas2);

        System.out.println("Apague toda a lista");
        notas2.clear();
        System.out.println(notas2);

        System.out.println("Confira se a lista está vazia: " + notas2.isEmpty());

    }
}
