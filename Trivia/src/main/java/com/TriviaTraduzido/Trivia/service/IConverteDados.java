package com.TriviaTraduzido.Trivia.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
