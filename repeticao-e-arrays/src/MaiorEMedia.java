import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MaiorEMedia {
    public static void main(String[] args) {
        // programa que recebe notas em loop e salva em uma lista
        // em seguida mostra todas as notas, media e o maior numero informado
        List<Double> notas = new ArrayList<>();
        double maior = 0.0;
        double nota;

        while(true){
            try {
                String entrada = JOptionPane.showInputDialog(null, "Informe uma nota");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    break;
                }

                nota = Double.parseDouble(entrada);

                if(nota < 0.0 || nota > 10.0) {
                    JOptionPane.showMessageDialog(null, "A NOTA DEVE ESTAR ENTRE 0 E 10");
                    continue;
                }

                maior = nota > maior ? nota : maior; //se a nota for maior que o maior numero atual ela passa a ser a maior

                notas.add(nota);

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERRO, FORMATO INFORMADO INVALIDO, TENTE NOVAMENTE");
            }
        }

        if (notas.isEmpty()){ // se a lista estiver vazia
            JOptionPane.showMessageDialog(null, "a lista esta vazia. Encerrando programa...");
            System.exit(0);
        }

        double soma = 0.0;

        for (double n : notas){ // para cada double n dentro da lista notas…
            soma += n;
        }

        double media = soma / notas.size();

        JOptionPane.showMessageDialog(null, "Numeros informados: " + notas + "\n" + String.format("Media: %.1f", media) +"\nMaior numero: "+ maior);


    }
}
