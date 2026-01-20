import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a palavra para verificar o palindromo: ");
        String palavra = sc.nextLine();

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        if (palavra.equals(invertida)){
            System.out.println("a palavra: "+ palavra+ " é um palindromo");
        }
        else{
            System.out.println("a palavra: "+ palavra+ " nao é um palindromo");
            System.out.println("palavra invertida: "+invertida);
        }
    }
}
