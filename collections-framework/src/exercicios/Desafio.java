package exercicios;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Map<Integer, Alunos> alunos = new HashMap<>();

        alunos.put(1, new Alunos("lucas", 10));
        alunos.put(2, new Alunos("marcella", 10));
        alunos.put(3, new Alunos("enzo", 5));
        alunos.put(4, new Alunos("ana", 2));
        alunos.put(5, new Alunos("pedro", 5));

        List<Map.Entry<Integer, Alunos>> alunosOrdenados = new ArrayList<>(alunos.entrySet());

        alunosOrdenados.sort(Comparator.comparing((Map.Entry<Integer, Alunos> e) -> e.getValue().getNota()).reversed()
                .thenComparing(e -> e.getValue().getNome()));


        int contador = 1;
        for (Map.Entry<Integer, Alunos> a : alunosOrdenados){
            Alunos aluno = a.getValue();
            System.out.println(contador + "° " + aluno.getNome() + " | " + aluno.getNota() );
            contador++;
        }

    }
}
class Alunos{
    private String nome;
    private int nota;


    public Alunos(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return nota == alunos.nota && Objects.equals(nome, alunos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}

