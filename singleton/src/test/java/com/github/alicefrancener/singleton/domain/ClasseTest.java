package com.github.alicefrancener.singleton.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasseTest {

    @Test
    void duasConexoesMesmaInstancia() {
        ConexaoDB conexao = ConexaoDB.getInstance();
        conexao.setSenha("senha123");

        ConexaoDB conexao2 = ConexaoDB.getInstance();
        assertEquals(conexao.getSenha(),conexao2.getSenha());
    }

}


