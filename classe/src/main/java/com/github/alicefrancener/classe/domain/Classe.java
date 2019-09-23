
package com.github.alicefrancener.classe.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Classe extends FileInputStream implements AutoCloseable {


    public Classe(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void close() throws IOException {
        super.close();
        throw new RuntimeException("Método close chamado.");
    }
}
