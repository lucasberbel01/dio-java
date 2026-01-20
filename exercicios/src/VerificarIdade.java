import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade");
        int idade = sc.nextInt();

        System.out.println(idade > 18 ? "maior de idade" : "menor de idade");
    }
}
