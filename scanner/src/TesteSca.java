import java.util.Locale;
import java.util.Scanner;

public class TesteSca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("informe o seu nome: ");
        String nome = sc.next();

        System.out.println("informe a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("informe a sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("seu nome: " + nome +  " sua idade: "+ idade+ " sua altura: "+altura);
    }
}