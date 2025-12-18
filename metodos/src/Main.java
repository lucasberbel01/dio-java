import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o primeiro numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o segundo numero numero"));
        String operacao = JOptionPane.showInputDialog(null,"informe a operacao (+ - * /)");

        switch (operacao){
            case "+":
                cal.somar(n1,n2);
                break;
            case "-":
                cal.subtrair(n1,n2);
                break;
            case "*":
                cal.multiplicar(n1,n2);
                break;
            case "/":
                cal.dividir(n1,n2);

        }



        Quadrilateros qua = new Quadrilateros();
        System.out.println(qua.area(10));//quadrado;
        System.out.println(qua.area(10,10));//retangulo;
        System.out.println(qua.area(6,5,4));

    }
}