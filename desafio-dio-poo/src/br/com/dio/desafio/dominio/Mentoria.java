package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //titulo e descricao
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    protected double calcularXP() {
        return XP_PADRAO+20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +
                "descricao=" + getDescricao()+
                "data=" + data +
                "} ";
    }
}
