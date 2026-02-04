package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    //titulo e descricao
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    protected double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo="+ getTitulo() +
                "descricao="+ getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                "}";

    }
}


