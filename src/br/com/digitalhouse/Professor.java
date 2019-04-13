package br.com.digitalhouse;

import java.util.Set;

public class Professor implements Docente {

    private String nome;
    private String rd;

    public Professor (String nome, String rd) {
        this.nome = nome;
        this.rd = rd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    @Override
    public void darAula() {
        System.out.println("Professor está lecionando aulas");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Professor realizou a chamada antes de iniciar a aula");
    }
}
