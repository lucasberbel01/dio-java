package exercicios;

import java.util.*;

public class ExerciciosSet {
    public static void main(String[] args) {
        /*List<Integer> numeros = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,5));

        //Set<Integer> numerosSemRepeticao = new HashSet<>(numeros);

        //System.out.println(numerosSemRepeticao);

        //List<Integer> novaLista = new ArrayList<>(numerosSemRepeticao);

        //System.out.println(novaLista);

        // Pessoa p1 = new Pessoa("lucas", 19);
        //Pessoa p2 = new Pessoa("lucas", 19);

        //System.out.println(p1.equals(p2));

        //Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(p1);
        pessoas.add(p2);

        System.out.println(pessoas);

         */


    }
}
class Contato {
    private String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}



class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }


}
