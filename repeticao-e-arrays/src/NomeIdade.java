import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        //programa que recebe nomes e idades em loop
        //fiquei com preguica de fazer usando try catch e JOPane

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        while(true){
            System.out.println("informe o seu nome: ");
            nome = sc.nextLine();

            if(nome.equals("0")){
                break;
            }

            System.out.println("informe a sua idade: ");
            idade = Integer.parseInt((sc.nextLine()));

            System.out.println(nome + idade);
        }

        System.out.println("programa encerrado");

        sc.close();
    }
}
