package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Suspeito> suspeitos = new ArrayList<>();

        int varControle = 0;
        while (varControle <3){
            System.out.println("qual o nome do suspeito? ");
            String nome = sc.nextLine();

            System.out.println("telefonou para a vitima? ");
            boolean telefonou = sc.nextLine().trim().toLowerCase().equals("sim");

            System.out.println("esteve no local do assassinato? ");
            boolean esteveLocal= sc.nextLine().trim().toLowerCase().equals("sim");

            System.out.println("Mora perto? ");
            boolean moraPerto = sc.nextLine().trim().toLowerCase().equals("sim");

            System.out.println("devia para a vitima? ");
            boolean devia = sc.nextLine().trim().toLowerCase().equals("sim");

            System.out.println("trabalhou com a vitima? ");
            boolean trabalhou = sc.nextLine().trim().toLowerCase().equals("sim");

            Suspeito sus = new Suspeito(nome, telefonou, esteveLocal, moraPerto, devia, trabalhou);

            suspeitos.add(sus);
            varControle++;

        }

        for (Suspeito s : suspeitos){
            System.out.println("nome: " + s.getNome() + "\nClassificacao: " + s.classificar());
        }


    }
}

class Suspeito{
    private String nome;
    private boolean telefonou;
    private boolean esteveLocal;
    private boolean moraPerto;
    private boolean devia;
    private boolean trabalhou;

    public Suspeito(String nome, boolean telefonou, boolean esteveLocal, boolean moraPerto, boolean devia, boolean trabalhou) {
        this.nome = nome;
        this.telefonou = telefonou;
        this.esteveLocal = esteveLocal;
        this.moraPerto = moraPerto;
        this.devia = devia;
        this.trabalhou = trabalhou;
    }

    public String getNome() {
        return nome;
    }

    public int contarSims(){
        int contador = 0;

        if(telefonou) contador++;
        if(esteveLocal) contador++;
        if(moraPerto) contador++;
        if(devia) contador++;
       if(trabalhou) contador++;

       return contador;
   }

   public String classificar(){
        int contador = contarSims();

        if (contador==2){
            return "Suspeita";
        }

        if (contador ==3 || contador ==4){

            return "cumplice";
        }

        if (contador == 5){
            return "assassina";
        }

        else{
            return "inocente";
        }
   }
}
