package com.github.alicefrancener.classe.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClasseTest {
    // FIXME veja estratégia adotada pelo Josenilton (diria que é sólida e não possui dependência de contexto, como aquela abaixo). 
    // TODO veja https://github.com/newtonjose/ds-2019-02/blob/master/auto-closeable/src/test/java/com/github/newtonjose/autocloseable/FileInputStreamAutoCloseableTest.java
    @Test
    void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try (Classe obj = new Classe("teste.txt")) {
            }
        });
    }


}


