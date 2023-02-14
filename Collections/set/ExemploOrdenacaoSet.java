package Collections.set;

/* Dadas as seguintes informações sobre minhas séries favoritas,
cire um conjunto e o ordene exibindo:
(nome - genero - tempo de episodio):

Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Serie 3 = Nome: that '70s show, genero: comedia, tempoEpsodio: 25
 */

//Set - > Não permite repeição de valor;
//Não possui indexação de posição.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--"); //Utiliza-se o HashSet para ordem aleatória
        Set<Serie> minhasSeries = new HashSet<>(){{
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that '70s show", "comedia", 25));
            }};
        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem inserção\t--"); //Utiliza-se o LinkedhashSet para odem de inserção
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for(Serie serie : minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--"); //Utiliza-se a TreeSet para a ordem natural
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem Nome/Genero/TempoEpisódio\t--"); //Utiliza-se a TreeSet para a ordem natural
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}