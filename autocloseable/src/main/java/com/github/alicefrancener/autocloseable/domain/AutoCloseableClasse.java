
package com.github.alicefrancener.autocloseable.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseableClasse extends FileInputStream implements AutoCloseable {


    public AutoCloseableClasse(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void close() throws IOException {
        super.close();
        throw new RuntimeException("Método close chamado.");
    }
}
