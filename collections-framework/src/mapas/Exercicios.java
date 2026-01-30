package mapas;

import java.util.*;

public class Exercicios {


    public static void main(String[] args) {

        Dado dado = new Dado();

        Map<Integer, Integer> resultadoDado = new TreeMap<>();


        for( int i = 0; i <100; i++){
            int rodada = dado.rolarDado();

            resultadoDado.merge(rodada, 1, Integer::sum); //rodada = chave, ele verifica se a chave ja existe. caso nao, ele cria a chave e coloca o valor 1
                                                                // caso a chave 'rodada' ja exista ele pega o valor atual dela e soma +1
        }
        for(Map.Entry<Integer, Integer> entries : resultadoDado.entrySet()){
            System.out.println("numero: " + entries.getKey() + " - Quantidade de vezes: " + entries.getValue());

        }
    }
}
class Dado{
    public int rolarDado(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
