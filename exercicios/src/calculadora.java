import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA");

        System.out.println("Informe o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("informe o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("soma: "+ (n1 + n2));
        System.out.println("sub: "+ (n1 - n2));
        System.out.println("mult: "+ (n1 * n2));
        System.out.println("div: "+ (n1 / n2));
    }
}
