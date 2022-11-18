package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private Set<Desafio> desafios = new HashSet<Desafio>();
    private Questionario questionario;
    private boolean concluiu = false;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDesafio(Desafio desafio){
        desafios.add(desafio);
    }

    public Set<Desafio> getDesafio(){
        return desafios;
    }

    public void setQuestionario(Questionario questionario){
        this.questionario = questionario;
    }

    public Questionario getQuestionario(){
        return questionario;
    }


    @Override
    public String toString() {
        return "\n- Curso{" +
                "- Titulo: " + getTitulo() + "\n" +
                "- Descricao: " + getDescricao() + "\n" +
                "- Carga Horaria: " + cargaHoraria + "\n" +
                "- Desafios: " + getDesafio() + "\n" +
                "- Questionario: " + getQuestionario() +
                '}';
    }

    public void concluiuEtapa(){
        Iterator<Desafio> n =  desafios.iterator();
        int soma = 0;
        while(n.hasNext()){
            if(n.next().getAprovado() == true){
                soma++;
            }
        }
        if(soma==desafios.size() && questionario.getStatusAprovacao()==true){
            concluiu = true;
            System.out.println("Aprovado");
        }
    }
}
