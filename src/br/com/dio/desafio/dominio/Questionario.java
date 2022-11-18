package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Questionario {

    private String nome;
    private Set<Questao> questoes = new HashSet<Questao>();
    private boolean statusAprovacao = false;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuestao(Questao questao){
        questoes.add(questao);
    }

    public Set<Questao> getQuestoes(){
        return questoes;
    }
    public boolean getStatusAprovacao(){
        return statusAprovacao;
    }

    //Aplicando regra de negocio 70 de aprovação
    public void statusQuestionario(){
        double util = 0;
        Iterator<Questao> n = questoes.iterator();
        while(n.hasNext()){
            if(n.next().getStatusQuestao() == true){
                util++;
            }
        }
        
        if(questoes.size()*0.7 >= util){
            System.out.println("Parabéns, Aprovado!");
            statusAprovacao = true;
        } else {
            System.out.println("Você perdeu um Heart!");
        }
    }
    
    @Override
    public String toString() {
        return "{\n- Nome: " + getNome() + 
        "Questão: " + getQuestoes() + "}";
    }
}
