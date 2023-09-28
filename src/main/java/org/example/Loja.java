package org.example;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(String nomeProduto, double precoProduto, String nomeSetor){
        Setor setor = SetorFactory.getSetores(nomeSetor);
        Produto produto = new Produto(nomeProduto, precoProduto, setor);
        produtos.add(produto);
    }

    public List<String> obterProdutos(){
        List<String> saida = new ArrayList<String>();
        for (Produto produto : this.produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }


}
