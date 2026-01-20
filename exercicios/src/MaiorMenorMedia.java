import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        //programa que mostra uma lista de notas
        //mostra a maior e a menor
        //soma e media delas

        List<Double> notas = new ArrayList<>();
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Informe uma nota: ");
                double nota = sc.nextDouble();

                if (nota == -1){
                    break;
                }

                if (nota >10 || nota <0){
                    System.out.println("A nota deve estar entre 0 e 10");
                    continue;
                }

                maior = nota > maior ? nota : maior;
                menor = nota < menor ? nota : menor;

                notas.add(nota);

            }catch (NumberFormatException e){
                System.out.println("Formato invalido! tente novamente");
            }
        }

        if (notas.isEmpty()){
            System.out.println("A lista esta vazia");
            System.exit(0);
        }
        double soma = Double.MIN_VALUE;

        for(double n:notas){
            soma+=n;
        }

        double media = soma / notas.size();

        System.out.println("Lista: " + notas);
        System.out.println("Maior numero: "+ maior);
        System.out.println("menor numero: "+ menor);
        System.out.println(String.format("Soma: %.1f", soma));
        System.out.println(String.format("Media: %.1f", media));

    }
}
