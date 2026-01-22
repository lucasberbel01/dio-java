package exercicios.alunocurso;

public class Aluno {
    private String nome;
    private Curso curso;

    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void exibirInfo(){
        System.out.println("nome do aluno: "+ nome);
        System.out.println("Curso matriculado: " + curso.getNome());
    }
}
