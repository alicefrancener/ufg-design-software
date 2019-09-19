
package com.github.alicefrancener.singleton.domain;

public final class ConexaoDB {

    /**
     * Atributo estático da única instância da classe.
     */
    private static final ConexaoDB INSTANCIA = criaInstancia();

    /**
     * Usuário e senha do banco de dados.
     */
    private String usuario;
    private String senha;

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

    /**
     * Métodos get e set
     */


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario (){
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

}