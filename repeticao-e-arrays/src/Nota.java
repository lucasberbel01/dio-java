import javax.swing.*;


public class Nota {
    public static void main(String[] args) {
        // programa que recebe nota em loop
        int nota;

        while(true){
            try{

                String entrada = JOptionPane.showInputDialog(null, "Informe uma nota de 0 a 10");

                if (entrada == null){
                    JOptionPane.showMessageDialog(null,"Encerrando programa...");
                    break;
                }

                nota = Integer.parseInt(entrada);

                if (nota > 10 || nota< 0 ){
                    JOptionPane.showMessageDialog(null,"a nota deve ser entre 0 e 10");
                    continue;
                }

                JOptionPane.showMessageDialog(null,"Nota informada: " + nota);


            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERRO, A NOTA NAO PODE SER UMA STRING");
            }
        }

        JOptionPane.showMessageDialog(null, "programa encerrado");
    }
}
