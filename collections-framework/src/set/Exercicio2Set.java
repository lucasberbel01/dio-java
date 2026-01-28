package set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2Set {
    public static void main(String[] args) {
        //por ordem de insercao
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(); //LinkedHashSet mantem a ordem de insercao

        linguagens.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "VS Code"));

        System.out.println("Ordem de inserção:");
        for (LinguagemFavorita l : linguagens) {
            System.out.println(l);
        }

        //por ordem natural
        Set<LinguagemFavorita> ordemNome = new TreeSet<>(linguagens); // TreeSet organiza em ordem natural automaticamente
                                                                      // porque eu sobrescrevi o metodo compareTo
        System.out.println("\nOrdem natural (nome):");
        for (LinguagemFavorita l : ordemNome) {
            System.out.println(l);
        }

        //por IDE
        Set<LinguagemFavorita> ordemIde = new TreeSet<>(
                Comparator.comparing(LinguagemFavorita::getIde) //estou configurando o TreeSet
        );                                                      //para organizar pela ordem natural
                                                                //das IDE
        ordemIde.addAll(linguagens);

        System.out.println("\nOrdem por IDE:");
        for (LinguagemFavorita l : ordemIde) {
            System.out.println(l);
        }


        //por ano de criacao e nome
        Set<LinguagemFavorita> ordemAnoNome = new TreeSet<>( // aqui eu faco duas comparacoes
                Comparator.comparing(LinguagemFavorita::getAnoDeCriacao) //primeiro comparo os anos
                        .thenComparing(LinguagemFavorita::getNome) // se empatar, comparo pelo nome
        );

        ordemAnoNome.addAll(linguagens);

        System.out.println("\nOrdem por ano de criação e nome:");
        for (LinguagemFavorita l : ordemAnoNome) {
            System.out.println(l);
        }


        //nome, ano de criacao e IDE
        Set<LinguagemFavorita> ordemCompleta = new TreeSet<>(
                Comparator.comparing(LinguagemFavorita::getNome) //comparando pelo nome
                        .thenComparing(LinguagemFavorita::getAnoDeCriacao) // entao pelo ano
                        .thenComparing(LinguagemFavorita::getIde) // entao pela IDE
        );

        ordemCompleta.addAll(linguagens);

        System.out.println("\nOrdem por nome, ano e IDE:");
        for (LinguagemFavorita l : ordemCompleta) {
            System.out.println(l);
        }

    }
}



class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagemFavorita outra) {
        return this.nome.compareToIgnoreCase(outra.nome);
    }

    @Override
    public String toString() {
        return nome + " - " + anoDeCriacao + " - " + ide;
    }
}
