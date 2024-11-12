package com.TriviaTraduzido.Trivia.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTrivia(
        @JsonAlias("question") String questao,
        @JsonAlias("correct_answer") String correta,
        @JsonAlias("incorrect_answers") List<String> incorretas
) {}

