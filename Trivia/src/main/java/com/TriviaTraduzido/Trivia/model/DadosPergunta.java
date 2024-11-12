package com.TriviaTraduzido.Trivia.model;

import com.TriviaTraduzido.Trivia.service.ConsumoAPI;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DadosPergunta {
    public DadosTrivia criaPergunta(){
        ObjectMapper mapper = new ObjectMapper();
        String endereco = "https://opentdb.com/api.php?amount=1";
        ConsumoAPI consumo = new ConsumoAPI();
        var json = consumo.obterDados(endereco);
        try {
            // Desserializando JSON para a classe Root
            Root root = mapper.readValue(json, Root.class);

            // Acessando diretamente o primeiro item de "results", se existir
            if (root.getResults() != null && !root.getResults().isEmpty()) {
                return root.getResults().get(0);
            } else {
                System.out.println("Nenhum dado encontrado em 'results'.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
