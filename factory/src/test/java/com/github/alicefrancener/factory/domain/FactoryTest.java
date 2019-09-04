package com.github.alicefrancener.factory.domain;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    public void testAtividades() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Aluno aluno = FactoryTrabalhador.newInstance("com.github" +
                ".alicefrancener.factory.domain.Aluno");
        Professor professor = FactoryTrabalhador.newInstance("com.github" +
                ".alicefrancener.factory.domain.Professor");
        assertEquals("estudar", aluno.atividade());
        assertEquals("educar", professor.atividade());
    }






}
