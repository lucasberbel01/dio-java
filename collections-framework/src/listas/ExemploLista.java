package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        int var_controle = 0;
        while (var_controle < 5){
            System.out.println("Informe a " + (var_controle+1) + "° nota");
            Double nota = sc.nextDouble();

             notas.add(nota);
             var_controle+=1;
        }


        System.out.println(notas.indexOf(5d));



    }
}
