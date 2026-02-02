package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(Arrays.asList("marcella", "lucas","marcella", "lucas"));

        List<String> nomesSemRepeticao = new ArrayList<>();

        for (String nome : nomes){
            if (!nomesSemRepeticao.contains(nome)){
                nomesSemRepeticao.add(nome);
            }
        }

        System.out.println(nomesSemRepeticao);



    }
}
