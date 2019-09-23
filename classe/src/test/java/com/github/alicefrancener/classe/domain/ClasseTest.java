package com.github.alicefrancener.classe.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClasseTest {
    @Test
    void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try (Classe obj = new Classe("teste.txt")) {
            }
        });
    }


}


