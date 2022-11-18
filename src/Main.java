

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desafio;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Questao;
import br.com.dio.desafio.dominio.Questionario;

public class Main {
    public static void main(String[] args) {

        //Criando curso
        Curso curso = new Curso();
        curso.setTitulo("Java Developer");
        curso.setCargaHoraria(50);
        curso.setDescricao("Desenvolvimento full stack com Java");
        
        Questao questao1 = new Questao();
        questao1.setPergunta("Qual dos pílares não está relacionado a Orientação Objeto?");
        String resposta1 = "Abstração";
        String resposta2 = "Polimorfismo";
        String resposta3 = "Herença";
        String resposta4 = "Compartilhamento";
        String resposta5 = "Encapsulamento";
        questao1.setOpcaoResposta(resposta5);
        questao1.setOpcaoResposta(resposta4);
        questao1.setOpcaoResposta(resposta3);
        questao1.setOpcaoResposta(resposta2);
        questao1.setOpcaoResposta(resposta1);
        questao1.setRespostaCerta(resposta4);

        Questionario questionario = new Questionario();
        questionario.setQuestao(questao1);
        questionario.setNome("Orientação Objetos");
        
        curso.setQuestionario(questionario);

        Desafio desafio1 = new Desafio();
        Desafio desafio2 = new Desafio();
        Desafio desafio3 = new Desafio();
        Desafio desafio4 = new Desafio();

        desafio1.setNome("Desafio 1");
        desafio2.setNome("Desafio 2");
        desafio3.setNome("Desafio 3");
        desafio4.setNome("Desafio 4");

        curso.setDesafio(desafio4);
        curso.setDesafio(desafio3);
        curso.setDesafio(desafio2);
        curso.setDesafio(desafio1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Criando API com Java");
        mentoria1.setDescricao("Criando uma api com Spring Framework");


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java Developer");
        bootcamp1.setConteudos(curso);
        bootcamp1.setConteudos(mentoria1);


        Dev dan = new Dev();

        dan.setNome("Danilo");
        dan.inscreverBootcamp(bootcamp1);

        System.out.println(dan);
    }

}
