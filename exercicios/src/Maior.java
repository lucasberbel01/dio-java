import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int maior = Integer.MIN_VALUE;

        while (i < 3){
            System.out.println("informe o " + (i+1) + " numero:");
            int numero = sc.nextInt();

            if(numero > maior){
                maior = numero;
            }
            i++;
        }
        System.out.println("o maior numero é: "+ maior);
    }
}
