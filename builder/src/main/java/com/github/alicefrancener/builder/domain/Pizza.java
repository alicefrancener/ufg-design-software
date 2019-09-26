package com.github.alicefrancener.builder.domain;


public class Pizza {

    private Tamanho tamanho;
    private String borda;
    private boolean queijo;
    private boolean tomate;
    private boolean calabresa;
    private boolean cebola;

    public static class Builder {
        private Tamanho tamanho;
        private String borda;
        private boolean queijo;
        private boolean tomate;
        private boolean calabresa;
        private boolean cebola;

        /**
         * O tamanho da Pizza é obrigatório.
         *
         * @param tamanho o tamanho é obrigatório.
         */
        public Builder(final Tamanho tamanho) {
            this.tamanho = tamanho;
        }

        public Builder addBorda(final String borda) {
            this.borda = borda;
            return this;
        }

        public Builder addQueijo(final boolean queijo) {
            this.queijo = queijo;
            return this;
        }

        public Builder addTomate(final boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public Builder addCalabresa(final boolean calabresa) {
            this.calabresa = calabresa;
            return this;
        }

        public Builder addCebola(final boolean cebola) {
            this.cebola = cebola;
            return this;
        }

        /**
         * Cria uma instância da classe {@link Pizza} conforme os parâmetros
         * fornecidos.
         *
         * @return Uma instância da classe {@link Pizza} conforme os
         * parâmetros fornecidos.
         */
        public Pizza build() {
            return new Pizza(this);
        }
    }

    /**
     * Construtor PRIVADO que faz uso de objeto da classe {@link Builder}.
     *
     * @param builder Objeto contendo valores a partir dos quais a instância
     *                da classe {@link Pizza} será criada.
     */
    private Pizza(Builder builder) {
        tamanho = builder.tamanho;
        borda = builder.borda;
        queijo = builder.queijo;
        tomate = builder.tomate;
        calabresa = builder.calabresa;
        cebola = builder.cebola;
    }

    public String getQueijo() {
        return queijo ? "com queijo" : "sem queijo";
    }

    public String getTomate() {
        return tomate ? "com tomate" : "sem tomate";
    }

    public String getCalabresa() {
        return calabresa ? "com calabresa" : "sem calabresa";
    }

    public String getCebola() {
        return cebola ? "com cebola" : "sem cebola";
    }

    /**
     * Produz a pizza completa.
     *
     * @return A pizza completa.
     */
    @Override
    public String toString() {
        final String parcial = String.join(" ", "Pizza:",
                tamanho.toString().toLowerCase(), borda, getQueijo(), getCalabresa(),
                getCebola(),
                getTomate());

        return parcial.trim().replaceAll(" +", " ");
    }
}
