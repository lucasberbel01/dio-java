package exercicios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExerciciosMapas {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        agenda.put("lucas", "11963013738");
        agenda.put("marcella", "1194813900");
        agenda.put("yudi", "40028922");

        Set<String> nomes = agenda.keySet();

        for(String n : nomes){
            System.out.print(n  + " | ");
        }

        Collection<String> telefones = agenda.values();
        System.out.println();
        for(String t : telefones){

            System.out.print(t  + " | ");
        }


        System.out.println();
        for (Map.Entry<String, String> contato : agenda.entrySet()){
            System.out.println(contato);
        }

    }
}
