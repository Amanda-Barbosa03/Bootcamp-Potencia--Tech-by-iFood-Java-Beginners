package Collections.map;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111; */

import java.util.*;

public class ListaContatos {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> listaContatos = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));

        }};
        for (Map.Entry<Integer, Contato> contato : listaContatos.entrySet()) {
            System.out.println("id:" + contato.getKey() + " - " + "Contato: " + contato.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> listaContatos1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for (Map.Entry<Integer, Contato> entry : listaContatos1.entrySet()) {
            System.out.println("id:" + entry.getKey() + " - " + "Contato: " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem id\t--");
        Map<Integer, Contato> listaContatos2 = new TreeMap<>(listaContatos);
        System.out.println(listaContatos2);
        for (Map.Entry<Integer, Contato> entry : listaContatos2.entrySet()) {
            System.out.println("id:" + entry.getKey() + " - " + "Contato: " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone\t--");
        //utilizando o Comparator
        /*Set<Map.Entry<Integer, Contato>> contatos = new TreeSet<>(new ComparatorTelefone());
        contatos.addAll(listaContatos2.entrySet());
        for (Map.Entry<Integer, Contato> entry : contatos) {
        System.out.println("id:" + entry.getKey() + " - " + "Telefone: " + entry.getValue().getNumero() + " - " +
            "Contato: " + entry.getValue().getNome());
        }*/
        // Utilizando classe anonima
        /*Set<Map.Entry<Integer, Contato>> contatos = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });*/

        //utilizando Interface Funcional
        /*Set<Map.Entry<Integer, Contato>> contatos = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> contato) {
                        return contato.getValue().getNumero();
                    }
                }));*/
        //Utilizando expressão Lambda
        Set<Map.Entry<Integer, Contato>> contatos = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNumero()));
        contatos.addAll(listaContatos2.entrySet());
        for (Map.Entry<Integer, Contato> entry : contatos) {
            System.out.println("id:" + entry.getKey() + " - " + "Telefone: " + entry.getValue().getNumero() + " - " +
            "Contato: " + entry.getValue().getNome());
        }

            System.out.println("\n--\tOrdem nome contato\t--");
            /*Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(new ComparatorContato());*/

        // Utilizando classe anonima
        /*Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
            }
        });*/
        // Utilizando Interface Funcional
        /*Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>,
                String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato> contato) {
                return contato.getValue().getNome();
            }
        }));*/

        // Ulizando expressao Lambda
        Set<Map.Entry<Integer, Contato>> contatos2 = new TreeSet<>(Comparator.comparing(contato ->
                contato.getValue().getNome()));
        contatos2.addAll(listaContatos2.entrySet());
        for (Map.Entry<Integer, Contato> entry : contatos2) {
            System.out.println("id:" + entry.getKey() + " - " + "Contato: " + entry.getValue().getNome() +
                    " - " + "Telefone: " + entry.getValue().getNumero());
        }
    }

}


    class Contato {
        String nome;
        Integer numero;

        public Contato(String nome, Integer numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public Integer getNumero() {
            return numero;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Contato contato = (Contato) o;
            return Objects.equals(nome, contato.nome) && Objects.equals(numero, contato.numero);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, numero);
        }

        @Override
        public String toString() {
            return "Contato{" +
                    "nome='" + nome + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }

 /*   class ComparatorTelefone implements Comparator<Map.Entry<Integer, Contato>> {

        @Override
        public int compare(Map.Entry<Integer, Contato> n1, Map.Entry<Integer, Contato> n2) {
            return n1.getValue().getNumero().compareTo(n2.getValue().getNumero());
        }
    }*/

    /*class ComparatorContato implements Comparator<Map.Entry<Integer, Contato>> {

        @Override
        public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
            return c1.getValue().getNome().compareTo(c2.getValue().getNome());
        }
    }*/





