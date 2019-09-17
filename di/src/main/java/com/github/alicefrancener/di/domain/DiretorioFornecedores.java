package com.github.alicefrancener.di.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DiretorioFornecedores {

    private List<Supplier<Leite>> listaFornecedores =
            new ArrayList<Supplier<Leite>>();

    public void adiciona(Supplier<Leite> leiteSupplier){
        listaFornecedores.add(leiteSupplier);
    }

    public List<String> fornecedores(){
        List<String> nomeFornecedores = new ArrayList<String>();
        for(Supplier<Leite> fornecedor: listaFornecedores ) {
            String nomeFornecedor = fornecedor.get().getFornecedor();
            nomeFornecedores.add(nomeFornecedor);
        }

        return nomeFornecedores;
    }



}
