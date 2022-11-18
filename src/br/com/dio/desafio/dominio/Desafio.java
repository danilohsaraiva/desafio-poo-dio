package br.com.dio.desafio.dominio;

public class Desafio {

    private String nome;
    private boolean aprovado = false;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void responderDesafio(boolean resposta){
        if(resposta == true){
            this.aprovado = true;
        } else {
            System.out.println("Você perdeu um heart!");
        }
    }

    public boolean getAprovado(){
        return aprovado;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " - " +
        "Aprovado: " + getAprovado() + "";
    }

}
