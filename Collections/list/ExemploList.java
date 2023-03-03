package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        /* Criação de List
        List<Double> notas = new ArrayList<>(); // Usado a partir do Java 5 - Generics - Diamond operator <>
        List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //Passa os argumentos
        List<Double> notas3 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Não premite inclusão nem exclusão de elementos
        List<Double> notas4 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Lista imutável */


        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        // Adição de elementos: os elementos são salvos na lista conforme a ordem em que foram inseridos
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //Impressão
        System.out.println(notas); // ou System.out.println(notas.toString());

        //Impressão do index/posição de um elemento - método indexOf()
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //Adição de elemento em uma posição específica da lista - método add() com argumento index e elemento
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        //Susbtituição de elemento - método set() com argumento index (int i ou indexOf()) e elemento (Double e)
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //Verificação de elemento contido na lista - Método contains();
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //Impressão na ordem de inserção, necessário apenas imprirmir a lista
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //Uso do for each para impressão de cada elemento em uma linha
        for (Double nota : notas) System.out.println(nota);

        //Exibição um elemento específico da List - método get();
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        //Exibição do menor elemento da lit - função Collections.min passando como argumento a lista.
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Exibição do mair elemento da lit - função Collections.max passando como argumento a lista.
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Os tipos Double, Integer, String implementam Comparable que realiza a comparação entre as variáveis (notas)
        // Método iterator usado para somar os elementos da lista. .hasnext utilizado para verificar se tem um outro elemento na sequencia.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Método .size indica a quantidade de elementos dentro de uma array
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        //Médodo .remove pode remover o elemento especificamente ou a posição a que ele se refere.
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //Método clear apaga toda a lista
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        //Método is empty verifica se tem elementos na lista e retorna true e false.
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}