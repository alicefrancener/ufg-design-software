package com.github.alicefrancener.singleton.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConexaoDBTest {

    @Test
    void duasConexoesMesmaInstancia() {
        ConexaoDB conexao = ConexaoDB.getInstance();
        ConexaoDB conexao2 = ConexaoDB.getInstance();
        assertSame(conexao, conexao2);
    }

}


