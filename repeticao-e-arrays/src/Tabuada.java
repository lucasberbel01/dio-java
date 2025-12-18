import javax.swing.*;

public class Tabuada {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero que voce deseja ver a tabuada"));

        for(int i = 1; i<11; i++){
            System.out.println(numero + " X " + i + ": " + numero * i);
        }
    }
}
