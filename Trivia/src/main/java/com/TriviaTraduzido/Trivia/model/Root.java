package com.TriviaTraduzido.Trivia.model;

import com.TriviaTraduzido.Trivia.model.DadosTrivia;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private List<DadosTrivia> results;

    public List<DadosTrivia> getResults() { return results; }
    public void setResults(List<DadosTrivia> results) { this.results = results; }
}