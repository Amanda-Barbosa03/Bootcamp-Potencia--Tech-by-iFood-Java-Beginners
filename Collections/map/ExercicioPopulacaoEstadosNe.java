package Collections.map;

import java.util.*;

public class ExercicioPopulacaoEstadosNe {
    /*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNe = new HashMap<>() {{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> populacaoEstadoNe : populacaoEstadosNe.entrySet()) {
            System.out.print("Estado = " + populacaoEstadoNe.getKey() + " - " + "População = " + populacaoEstadoNe.getValue() + "\n");
        }

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoEstadosNe.replace("RN",3534265,3534165);
        for (Map.Entry<String, Integer> populacaoEstadoNe : populacaoEstadosNe.entrySet()) {
            System.out.print("Estado = " + populacaoEstadoNe.getKey() + " - " + "População = " + populacaoEstadoNe.getValue() + "\n");
        }

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione: PB - 4.039.277");
        if (!populacaoEstadosNe.containsKey("PB")) {
            populacaoEstadosNe.put("PB", 4039277);
        }
        for (Map.Entry<String, Integer> populacaoEstadoNe : populacaoEstadosNe.entrySet()) {
            System.out.print("Estado = " + populacaoEstadoNe.getKey() + " - " + "População = " + populacaoEstadoNe.getValue() + "\n");
        }


        System.out.println("Exiba a população do estado PE:");
        System.out.println(populacaoEstadosNe.get("PE") + "\n");

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNe1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> populacaoEstadoNe1 : populacaoEstadosNe1.entrySet()) {
            System.out.print("Estado = " + populacaoEstadoNe1.getKey() + " - " + "População = " + populacaoEstadoNe1.getValue() + "\n");
        }


        System.out.println("Exiba todos os estados e suas populações na ordem alfabética:");
        Map<String, Integer> populacaoEstadosNe2 = new TreeMap<>(populacaoEstadosNe);


        Set <Map.Entry<String, Integer>> populacaoEstado = populacaoEstadosNe.entrySet();
        Collection<Integer> populacoes = populacaoEstadosNe2.values();

        System.out.println("Exiba o estado com o menor população e seu respectivo valor:");
        Integer menorPopulacao = Collections.min(populacoes);
        String estadoMenorPopulacao = "";
        for ( Map.Entry<String, Integer> estado : populacaoEstado) {
            if (estado.getValue().equals(menorPopulacao))
                estadoMenorPopulacao = estado.getKey();
        }
        System.out.println(estadoMenorPopulacao + " - " + menorPopulacao + "\n");

        System.out.println("Exiba o estado com a maior população e seu respectivo valor:");
        Integer maiorPopulacao = Collections.max(populacoes);
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> estado : populacaoEstado) {
            if (estado.getValue().equals(maiorPopulacao))
                estadoMaiorPopulacao = estado.getKey();
        }
        System.out.println(estadoMaiorPopulacao + " - " + menorPopulacao + "\n");

        System.out.println("Exiba a soma da população desses estados:");
         Iterator<Integer> iterator = populacoes.iterator();
         Integer soma = 0;
         for (Integer populacao : populacoes) {
            while (iterator.hasNext()) {
                soma += iterator.next();
             }
         }
        System.out.println("A soma é: " + soma + "\n");


        System.out.println("Exiba a média da população deste dicionário de estados:");
        int media = soma/populacoes.size();
        System.out.println("A média é: " + media + "\n");

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator <Integer> iterator1 = populacoes.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            if ( next < 4000000) {
                iterator1.remove();
            }
        }
        for (Map.Entry<String, Integer> populacaoEstadoNe2 : populacaoEstadosNe2.entrySet()) {
            System.out.print("Estado = " + populacaoEstadoNe2.getKey() + " - " + "População = " + populacaoEstadoNe2.getValue() + "\n");
        }


        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNe2.clear();

        System.out.println("Confira se a lista está vazia: ");
        System.out.println(populacaoEstadosNe2.isEmpty());
    }

}
