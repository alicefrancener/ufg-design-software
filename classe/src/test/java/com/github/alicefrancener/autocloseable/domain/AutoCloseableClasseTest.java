package com.github.alicefrancener.autocloseable.domain;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoCloseableClasseTest {

    @Test
    void verificaCloseChamado() throws IOException {
        Files.createFile(Paths.get("arquivo.txt"));

        assertThrows(RuntimeException.class, () -> {
            try (AutoCloseableClasse obj = new AutoCloseableClasse("arquivo.txt")) {
            }
        });

        Files.deleteIfExists(Paths.get("arquivo.txt"));
    }
}


