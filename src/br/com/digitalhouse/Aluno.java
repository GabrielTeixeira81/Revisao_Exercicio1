package br.com.digitalhouse;

import java.util.Set;

public class Aluno {

    private String ra;
    private String nome;
    private String sobrenome;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome (String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void assistirAula (Set<Aula> aulas){
        for (Aula aula : aulas){
            System.out.println(this.nome + " : assistindo a aula: " + aula.getMateria().getnome());
        }
    }

    public void fazerLicaoDeCasa (){
        System.out.println(this.nome + " : fazer lição de casa :)");
    }

}
