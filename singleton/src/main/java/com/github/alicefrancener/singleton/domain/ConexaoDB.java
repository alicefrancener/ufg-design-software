
package com.github.alicefrancener.singleton.domain;

public final class ConexaoDB {

    /**
     * Atributo estático da única instância da classe.
     */
    private static final ConexaoDB INSTANCIA = criaInstancia();


    /**
     * Construtor privado que evita instanciação fora da classe.
     */
    private ConexaoDB() {
    }

    /**
     * Método que cria instância.
     */
    private static ConexaoDB criaInstancia() {
        try {
            return new ConexaoDB();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Recupera a instância única da classe
     */
    public static ConexaoDB getInstance() {
        return INSTANCIA;
    }

}
