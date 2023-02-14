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
        System.out.println("Exiba as cores do arco-iris:");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        //TODO A quantidade de cores que o arco-iris tem
        System.out.printf("A quantidade de cores do Arco-Iris é: %d\n", arcoIris.size());

        //TODO Exiba as cores em ordem alfabética
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println("--\tOrdem Alfabetica\t--\n" + arcoIris2);

        //TODO Exiba as cores na ordem inversa da que foi informada

        System.out.println(Collections.reverseOrder());

        //TODO Exiba todas as cores que começam com a letra "V"
        Iterator<String> iterator = arcoIris2.iterator();

        //TODO Remova todas as cores que não começam com a letra "V"
        //TODO Limpe o conjunto
        //TODO Confira se o conjunto está vazio
    }
}

