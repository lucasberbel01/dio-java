package mapas;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Map<String, Double> estados = new TreeMap<>(){{
            put("PE", 9.616);
            put("AL", 3.351);
            put("CE", 9.187);
            put("RN", 3.531);
        }};


        estados.put("RN", 3.534);

        estados.put("PB", 4.039);

        //exibir na ordem natural
        System.out.println(estados);

        Map<String, Double> estados1 = new LinkedHashMap<>(){{
            put("PE", 9.616);
            put("AL", 3.351);
            put("CE", 9.187);
            put("RN", 3.531);
        }};

        System.out.println(estados1);

        //exibir o estado com a menor populacao
        double menorPopulacao = Collections.min(estados.values());

        for (Map.Entry<String, Double> entrie : estados.entrySet()){
            if (entrie.getValue().equals(menorPopulacao)){
                String estadoMenorPopulacao = entrie.getKey();
                System.out.println("Estado com a menor populacao: "+ estadoMenorPopulacao + " - Populacao: " + menorPopulacao  );
            }
        }

        //exibir o com a maior populacao
        double maiorPopulacao = Collections.max(estados.values());

        for (Map.Entry<String, Double> entrie : estados.entrySet()){
            if (entrie.getValue().equals(maiorPopulacao)){
                String estadoMaiorPopulacao = entrie.getKey();
                System.out.println("Estado com a maior populacao: "+ estadoMaiorPopulacao + " - Populacao: " + maiorPopulacao  );
            }
        }

        System.out.println("media");
        //media das populacoes
        Iterator<Double> it = estados.values().iterator();
        double soma = 0d;
        while(it.hasNext()){
            double valor = it.next();
            soma+=valor;

        }
        double media = (soma / estados.size());
        System.out.println(media);

        //excluir estados com menos de 4.000 habitantes
        Iterator<Double> it2 = estados.values().iterator();

        while(it2.hasNext()){
            if(it2.next() < 4.000){
            it2.remove();}
        }

        System.out.println("lista nova: " + estados);








    }
}
