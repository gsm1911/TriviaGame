package com.TriviaTraduzido.Trivia.main;

import com.TriviaTraduzido.Trivia.model.DadosPergunta;
import com.TriviaTraduzido.Trivia.model.DadosTrivia;
import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void exibeMenu() {
        List<String> respostas = new ArrayList<>();
        DadosPergunta pergunta = new DadosPergunta();
        String opcao;

        while(true){
            DadosTrivia trivia = pergunta.criaPergunta();
            String questao = StringEscapeUtils.unescapeHtml4(trivia.questao());
            Scanner leitor = new Scanner(System.in);

            System.out.println("Questão:\n " + questao);

            trivia.incorretas().forEach(p -> respostas.add((StringEscapeUtils.unescapeHtml4(p))));
            respostas.add(StringEscapeUtils.unescapeHtml4(trivia.correta()));
            Collections.shuffle(respostas);
            System.out.println("Alternativas: \n" + "A: " + respostas.get(0) + "\nB: " + respostas.get(1) + "\nC: " + respostas.get(2) + "\nD: " + respostas.get(3));

            System.out.println("Resposta: ");
            String resposta = leitor.nextLine();

            switch (resposta.toUpperCase()) {
                case "A":
                    if(respostas.get(0).equalsIgnoreCase(trivia.correta())){
                        System.out.println("Resposta correta!");
                    }else {
                        System.out.println("Resposta errada!\n A resposta certa era: " + trivia.correta());
                    }
                    break;
                case "B":
                    if(respostas.get(1).equalsIgnoreCase(trivia.correta())){
                        System.out.println("Resposta correta!");
                    }else {
                        System.out.println("Resposta errada!\n A resposta certa era: " + trivia.correta());
                    }
                    break;
                case "C":
                    if(respostas.get(2).equalsIgnoreCase(trivia.correta())){
                        System.out.println("Resposta correta!");
                    }else {
                        System.out.println("Resposta errada!\n A resposta certa era: " + trivia.correta());
                    }
                    break;
                case "D":
                    if(respostas.get(3).equalsIgnoreCase(trivia.correta())){
                        System.out.println("Resposta correta!");
                    } else {
                        System.out.println("Resposta errada!\n A resposta certa era: " + trivia.correta());
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja continuar? S/N");
            opcao = leitor.nextLine();
            if (!opcao.equalsIgnoreCase("S")){
                break;
            } else {
                respostas.clear();
            }
        }



    }
}
