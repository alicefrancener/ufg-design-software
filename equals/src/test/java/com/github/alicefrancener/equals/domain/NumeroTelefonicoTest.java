package com.github.alicefrancener.equals.domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeroTelefonicoTest {

    @Test
    public void numeroTelefoneReflexivo() {
        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");

        assertTrue(numero1.equals(numero1));
    }

    @Test
    public void numerosIguais() {
        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");
        NumeroTelefonico numero2 = new NumeroTelefonico("55","62","11111111");

        assertTrue(numero1.equals(numero2));
    }

    @Test
    public void numerosDiferentes() {
        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");
        NumeroTelefonico numero2 = new NumeroTelefonico("55","62","22222222");

        assertFalse(numero1.equals(numero2));
    }

    @Test
    public void objetosDiferentes() {
        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");
        String numero2 = "556211111111";

        assertFalse(numero1.equals(numero2));
    }

    @Test
    public void instaciaNull() {
        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");
        NumeroTelefonico numeroNull = null;

        assertFalse(numero1.equals(numeroNull));
    }

    @Test
    public void contemNumeroTelefone() {

        NumeroTelefonico numero1 = new NumeroTelefonico("55","62","11111111");
        Set<NumeroTelefonico> listaTelefones = new HashSet<>();
        listaTelefones.add(numero1);

        NumeroTelefonico numero2 = new NumeroTelefonico("55","62","11111111");

        assertTrue(listaTelefones.contains(numero2));
    }

}


