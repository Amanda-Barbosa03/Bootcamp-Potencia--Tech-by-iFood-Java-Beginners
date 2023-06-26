package Collections.map;

import java.util.*;


public class ExemploMap {
    public static void main(String[] args) {
        /* Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4 km/l
        modelo = uno - consumo = 15,6 km/l
        modelo = mobi - consumo = 16,1 km/l
        modelo = hb20 - consumo = 14,5 km/l
        modelo = kwid - consumo = 15,6 km/l
        */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares+"\n");

        System.out.println("Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.replace("gol",14.4,15.2);
        // ou  carrosPoupulares.put("gol", 15.2);
        System.out.println(carrosPopulares+"\n");

        System.out.println("Confira se o modelo tucson está no dicionário:");
        System.out.println(carrosPopulares.containsKey("tucson")+"\n");

        System.out.println("Exiba o consumo do uno:");
        System.out.println(carrosPopulares.get("uno")+"\n");

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos + "\n");

        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos +"\n");

        System.out.println("Exiba o modelo mais econômico e o seu consumo:");
        Set<Map.Entry<String, Double>> modelosConsumos = carrosPopulares.entrySet(); // Retorna um Set com as keys e values
        Double consumoEconomico =  Collections.max(consumos);
        String modeloEconomico;
        for (Map.Entry<String, Double> modelo : modelosConsumos) {
            if (modelo.getValue().equals(consumoEconomico)) { // Verifica se o valor da entrada é igual ao consuoEconomico
                modeloEconomico = modelo.getKey(); // Pega a chave correspondente a entrada e armazena na variável modeloEconomico
                System.out.println(modeloEconomico + " - " + consumoEconomico + "\n");
            }
        }

        Double consumoMenosEconomico = Collections.min(consumos);
        String modeloMenosEconomico;
        for (Map.Entry<String, Double> modelo : modelosConsumos) {
            if ( modelo.getValue().equals(consumoMenosEconomico)){
                modeloMenosEconomico = modelo.getKey();
                System.out.println(modeloMenosEconomico + " - " + consumoMenosEconomico + "\n");
            }
        }
        System.out.println("Exiba a soma dos consumos:");
        Iterator<Double> iterator = consumos.iterator();
        Double soma = 0.0;
        for (Double consumo : consumos) {
            while (iterator.hasNext()) {
                soma += iterator.next();
            }
        }
        System.out.println(soma + "\n");

        System.out.println("Exiba a média dos consumos:");
        Double media = soma/consumos.size();
        System.out.println(media + "\n");

        System.out.println("Remova os modelos com consumo igual a 15,6:");
        Iterator <Double> iterator1 = consumos.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
            iterator1.remove();
            }
        }
        System.out.println(carrosPopulares + "\n");

        System.out.println("Exiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1 + "\n");

        System.out.println("Exiba o dicionário ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2 + "\n");

        System.out.println("Apague o dicionário de carros.");
        carrosPopulares.clear();

        System.out.println("Dicionario está vazio: " + carrosPopulares.isEmpty());

    }
}
