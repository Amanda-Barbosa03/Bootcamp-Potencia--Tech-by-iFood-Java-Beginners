package Collections.map;

import java.util.*;

/* Dados as seguintes informações sobre meus livros favotios e seus autores
crie um dicionario e ordene este dicionário exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo, páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, páinas: 408
Autor = Harai, Yuval Noah - Livro = nome: 21 Lições Para o Século 21, páginas: 432
 */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> livrosFavoritos = new HashMap<>(){{
            put("Hawking, Stephen ", new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles ", new Livro("O Poder do Hábito",408));
            put("Harai, Yuval Noah ", new Livro("21 Lições Para o Século 21",432));
        }};
        for (Map.Entry<String, Livro> livros : livrosFavoritos.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("--\tOrdem inserção\t--");
        Map<String, Livro> livrosFavoritos1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen ", new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles ", new Livro("O Poder do Hábito",408));
            put("Harai, Yuval Noah ", new Livro("21 Lições Para o Século 21",432));
        }};
        for (Map.Entry<String, Livro> livros : livrosFavoritos1.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> livrosFavoritos2 = new TreeMap<>(livrosFavoritos);
        for (Map.Entry<String, Livro> livros : livrosFavoritos2.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }


        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> livrosFavoritos3 = new TreeSet<>(new ComparatorNome());
        livrosFavoritos3.addAll(livrosFavoritos.entrySet());
        for (Map.Entry<String, Livro> livros : livrosFavoritos3){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }


        System.out.println("--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livro>> livrosFavoritos4 = new TreeSet<>(new ComparatorNumeroPaginas());
        livrosFavoritos4.addAll(livrosFavoritos.entrySet());
        for (Map.Entry<String, Livro> livros : livrosFavoritos4){
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + " - " + livros.getValue().getNumeroPaginas());
        }

    }
}

class Livro {
    private String nome;
    private Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && numeroPaginas.equals(livro.numeroPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
 class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

     @Override
     public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
         return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
     }
 }

 class ComparatorNumeroPaginas implements Comparator <Map.Entry<String, Livro>> {

    @Override
     public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNumeroPaginas().compareTo(l2.getValue().getNumeroPaginas());
    }
 }