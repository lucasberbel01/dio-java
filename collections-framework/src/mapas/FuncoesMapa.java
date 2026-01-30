package mapas;

import java.util.*;

public class FuncoesMapa {
    public static void main(String[] args) {
        //map é semelhante ao dicionario em python
        Map<String, Double> carrosPopulares = new HashMap<>(){{ //String se refere ao valor da chave, Double ao valor dentro dela
            put("gol", 14.4); // put = add
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares); // printa em ordem diferente da informada


        //substitua o consumo do gol
        carrosPopulares.put("gol", 15.2); // se a chave ja existir ele sobrescreve o valor


        //verifique se tucson esta no dicionario
        carrosPopulares.containsKey("tucson"); // verifica se a chave existe


        //exiba o consumo do uno
        carrosPopulares.get("uno");


        //exiba os modelos
        Set<String> modelos = carrosPopulares.keySet(); // keySet retorna um Set


        //exiba o consumo
        Collection<Double> consumo = carrosPopulares.values(); //values retorna uma Collection


        //exiba o modelo mais economico
        double consumoMaisEficiente = Collections.max(carrosPopulares.values()); // pegando o maior numero dentro do mapa
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // transformando chave e valor em "uma variavel so"

        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){ // percorrendo o dicionario
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente: "+ modeloMaisEficiente);
            }

        }

        //exiba o modelo menos economico

        double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        String modeloMenosEficiente;

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeloMenosEficiente);
            }

        }

        //soma de todos os consumos
        double soma = 0d;
        Iterator<Double> it = carrosPopulares.values().iterator();

        while(it.hasNext()){
            double valor = it.next();
            soma+=valor;
        }

        System.out.println("soma dos consumos: "+ soma);

        //exiba a media dos consumos
        double media = (soma / carrosPopulares.size());


        //exiba na ordem em que foi informado
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{ //linked mantem a ordem de insercao
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);


        //exiba na ordem natural dos modelos
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        //limpe o dicionario
        carrosPopulares.clear();

        carrosPopulares.isEmpty();

    }
}
