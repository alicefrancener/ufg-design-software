
package com.github.alicefrancener.di.domain;

import java.util.function.Supplier;

public class CaldasNovas implements Supplier<Leite> {

    @Override
    public Leite get() {
        return new Leite("Caldas Novas");
    }
}
