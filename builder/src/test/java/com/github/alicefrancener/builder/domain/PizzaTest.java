package com.github.alicefrancener.builder.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PizzaTest {

    @Test
    public void builderCasoTrivial() {
        Pizza.Builder pizza = new Pizza.Builder(Tamanho.GRANDE)
                .addBorda("catupiry");
        assertEquals("Pizza: grande catupiry sem queijo sem calabresa "
                + "sem cebola sem tomate", pizza.build().toString());
    }

    @Test
    void verificaBuilder() {
        Pizza.Builder builder = new Pizza.Builder(Tamanho.PEQUENA);
        Pizza pizza = builder
                .addBorda("sem borda")
                .addTomate(true)
                .addQueijo(false)
                .addCebola(true)
                .addCalabresa(true)
                .build();

        assertEquals("Pizza: pequena sem borda sem queijo com "
                + "calabresa com cebola com tomate", pizza.toString());
    }

}
