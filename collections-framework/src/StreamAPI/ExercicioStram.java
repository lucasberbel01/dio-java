package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStram {
    public static void main(String[] args) {
        List<String> numerosAleatorios = new ArrayList<>(Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5"));

        //imprima todos os elementos da lista
        System.out.println("imprima todos os elementos da lista");

        numerosAleatorios.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("pegue os 5 primeiros numeors e coloque dentro de um set");
        numerosAleatorios.stream()
                .limit(5) //limite 5
                .collect(Collectors.toSet())//colete os 5 e coloque em um Set
                .forEach(System.out::println); //imprima

        System.out.println();
        System.out.println();

        System.out.println("transforme a lista de strings em uma lista de int");

        List<Integer> numerosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)//transforme String em int
                .collect(Collectors.toList()); // colete e coloque dentro de uma lista

        numerosInteiros.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("pegue os numeros pares maiores que 2 e coloque em uma lista");

        List<Integer> numerosPares = numerosInteiros.stream()
                .filter(i -> i % 2 == 0 && i > 2) // filtre os numeros pares e maiores que 2
                .collect(Collectors.toList());

        numerosPares.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("mostre a media dos numeros");

        numerosInteiros.stream().
                mapToInt( i -> i)
                .average() // faz a media sozinho
                .ifPresent(System.out::println); // se conseguir ele imprime

        System.out.println();
        System.out.println();

        System.out.println("remova os numeros impares");

        numerosInteiros.removeIf(i -> (i  % 2 !=0));
        System.out.println(numerosInteiros);





    }
}
