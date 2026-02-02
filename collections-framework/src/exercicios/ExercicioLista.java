package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ExercicioLista {
    public static void main(String[] args) {
       /*
        List<String> nomes = new ArrayList<>(Arrays.asList("marcella", "lucas","marcella", "lucas"));

        List<String> nomesSemRepeticao = new ArrayList<>();

        for (String nome : nomes){
            if (!nomesSemRepeticao.contains(nome)){
                nomesSemRepeticao.add(nome);
            }
        }

        System.out.println(nomesSemRepeticao);

        */
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("marcella", 7.0));
        alunos.add(new Aluno("lucas", 6.5));
        alunos.add(new Aluno("enzo", 5d));
        alunos.add(new Aluno("ana", 4.2));

        System.out.println(alunos);

        for(Aluno a : alunos){
            if(a.getNota() >= 7){
                System.out.println("aluno com nota > 7: "+a.getNome());
            }
        }


        double soma =0d;
        for(Aluno a : alunos){
            soma+=a.getNota();
        }

        System.out.println("media da turma = " + (soma/alunos.size()));




    }
}

class Aluno{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}

