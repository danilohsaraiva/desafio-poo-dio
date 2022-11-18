package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Questao {

    private String pergunta;
    private Set<String> opcaoResposta = new HashSet<String>();
    private String respostaCerta;
    private boolean statusQuestao = false;

    public Questao(){

    }

    public String getPergunta(){
        return pergunta;
    }

    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
    }

    public Set<String> getopcaoResposta(){
        return opcaoResposta;
    }

    public void setOpcaoResposta(String resposta){
        opcaoResposta.add(resposta);
    }

    public void setRespostaCerta(String respostaCerta){
        this.respostaCerta = respostaCerta;
    }

    public String getRespostaCerta(){
        return respostaCerta;
    }

    //Bom eu não tenho o interesse de ter um setStatus, já que ele será alterado conforme a resposta por default será falso
    //Usarei para conferir dps

    public boolean getStatusQuestao(){
        return statusQuestao;
    }

    public void respondendoPergunta(String opcaoResposta){
        if(this.respostaCerta.equals(opcaoResposta)){
            statusQuestao = true;
            System.out.println("Acertou, colorir resposta de verde");
        } else {
            System.out.println("Errou, colorir a resposta de vermelho");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Questao questao = (Questao) obj;
        return Objects.equals(pergunta, questao.pergunta) && Objects.equals(opcaoResposta, questao.opcaoResposta) && Objects.equals(respostaCerta, questao.respostaCerta);
    }

    @Override
    public int hashCode() {
       
        return Objects.hash(pergunta, opcaoResposta, respostaCerta);
    }

    @Override
    public String toString() {
        return "\n- Pergunta: " + getPergunta() + "\n" +
        "- Opções de Resposta: " + getopcaoResposta() + "\n" +
        "- Resposta Certa: " + getRespostaCerta() +
        "}\n" ;
    }
}
