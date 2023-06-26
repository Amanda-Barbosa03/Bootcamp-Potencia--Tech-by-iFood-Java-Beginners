package Collections.set;

import java.util.*;

public class ExercicioArcoIris {
    public static void main(String[] args) {

        //TODO Crie um conjunto contendo as cores do arcoíris
        Set<String> arcoIris = new LinkedHashSet<>() {{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("anil");
            add("violeta");
        }};
        //TODO Exiba todas as cores uma abaixo da outra
        System.out.println("--\tCores do arco-iris\t--");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }

        //TODO A quantidade de cores que o arco-iris tem
        System.out.println("\n--\tQuantidade de cores do arco-iris\t--");
        System.out.printf(arcoIris.size() + " cores\n");


        //TODO Exiba as cores em ordem alfabética
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println("\n--\tOrdem Alfabetica\t--\n" + arcoIris2 +"\n");

        //TODO Exiba as cores na ordem inversa da que foi informada

        //TODO Exiba todas as cores que começam com a letra "V"
        System.out.println("--\tCores que começam com a letra 'v'\t--");
        for (String cor : arcoIris) {
            if (cor.startsWith("v")){
                System.out.println(cor);
            }
        }


        //TODO Remova todas as cores que não começam com a letra "V"
        System.out.println("\n--\tLista com as cores que não começam com 'v' removidas\t--");
        Set<String> arcoIris3 = new HashSet<>(arcoIris);
        Iterator<String> iterator1 = arcoIris3.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            if (!next.startsWith("v")) iterator1.remove();
        }
        System.out.println(arcoIris3);
        //arcoIris3.removeIf(next -> !next.startsWith("v"));

        //TO DO Limpe o conjunto e onfira se o conjunto está vazio
        System.out.println("\n--\tConjunto limpo e vazio\t--");
        arcoIris2.clear();
        System.out.println(arcoIris2.isEmpty());

    }
}