package com.github.alicefrancener.di.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiretorioFornecedoresTest {

    @Test
    void testAdicionaFornecedor() {
        DiretorioFornecedores diretorioFornecedores =
                new DiretorioFornecedores();

        diretorioFornecedores.adiciona(new CaldasNovas());
        assertEquals(1,diretorioFornecedores.fornecedores().size());
    }



























/*
    @Test
    public void test() {
        assertThrows(IllegalArgumentException.class, () -> Calendario.diaDaSemana(0, 8, 2016));
    }

    @Test
    public void anoIgualAoLimiteInferior() {
        assertEquals(0, Calendario.diaDaSemana(31, 12, 1753));
    }

    @Test
    public void diaDaSemanaDeHoje() {
        String hojeStr = Calendario.diaDaSemanaParaHoje();

        // Primeiro dia da semana é domingo, valor 0.
        LocalDate hoje = LocalDate.now();
        int diaDaSemanaJava = hoje.getDayOfWeek().getValue();

        // Ajustando para padrão adotado em Calendario
        int ajustado = (diaDaSemanaJava + 6) % 7;

        assertTrue(hojeStr.contains(Calendario.semana[ajustado]));
    }

    @Test
    public void coberturaCemPorCento() {
        assertNotNull(new Calendario());
    }*/
}


