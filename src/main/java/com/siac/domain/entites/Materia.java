package com.siac.domain.entites;

public class Materia {
    private String codigo;
    private String nome;
    private Integer horas;

    public Materia(String codigo, Integer horas, String nome) {
        this.codigo = codigo;
        this.horas = horas;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getHoras() {
        return horas;
    }

    public String getNome() {
        return nome;
    }
}
