package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Plataforma {

    private String nome;
    private Set<Mentoria> mentorias = new HashSet<Mentoria>();
    private Set<Bootcamp> bootcamps = new HashSet<Bootcamp>();
    private Set<Dev> desenvolvedores = new HashSet<Dev>();

    public Plataforma(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMentoria(Mentoria mentoria){
        mentorias.add(mentoria);
    }

    public Set<Mentoria> getMentorias(){
        return mentorias;
    }

    public void setBootcamps(Bootcamp bootcamp){
        bootcamps.add(bootcamp);
    }

    public Set<Bootcamp> getBootcamps(){
        return bootcamps;
    }

    public void setDesenvolvedores(Dev desenvolvedor){
        desenvolvedores.add(desenvolvedor);
    }

    public Set<Dev> getDesenvolvedores(){
        return desenvolvedores;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true; //Verficando se objeto adicionado é igual este obj
        if (obj == null || getClass() != obj.getClass()) return false; //Fazendo verificação por classe
        Plataforma plataforma = (Plataforma) obj; //Casting do novo obj para o tipo obj em questão
        return Objects.equals(nome, plataforma.nome) && /*Conferindo cada atributo utilizando do método equals*/
            Objects.equals(mentorias, plataforma.mentorias) &&
            Objects.equals(bootcamps, plataforma.bootcamps) &&
            Objects.equals(desenvolvedores, plataforma.desenvolvedores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mentorias, bootcamps, desenvolvedores);
    }

    @Override
    public String toString() {
        return "Plataforma: " + getNome() + '\n' +
        "Bootcamps: " + getBootcamps() + '\n' +
        "Mentorias: " + getMentorias() + '\n' +
        "Desenvolvedores: " + getDesenvolvedores()
        ;
    }
}
