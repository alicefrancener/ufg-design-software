
package com.github.alicefrancener.equals.domain;

public class NumeroTelefonico {

    private String codigoPais;
    private String codigoEstado;
    private String numeroTelefone;

    public NumeroTelefonico(String codigoPais, String codigoEstado,
                            String numeroTelefone) {
        this.codigoPais = codigoPais;
        this.codigoEstado = codigoEstado;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(obj instanceof NumeroTelefonico){
            NumeroTelefonico objNumeroTelefonico = (NumeroTelefonico) obj;

            return this.codigoPais == objNumeroTelefonico.codigoPais &&
                    this.codigoEstado == objNumeroTelefonico.codigoEstado &&
                    this.numeroTelefone == objNumeroTelefonico.numeroTelefone;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.codigoPais.hashCode() + this.codigoEstado.hashCode() +
                this.numeroTelefone.hashCode();
    }


}
