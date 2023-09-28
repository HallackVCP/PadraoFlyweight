package org.example;

public class Produto {

    private String nome;

    private double custo;

    private Setor setor;

    public Produto(String nome, double custo, Setor setor) {
        this.nome = nome;
        this.custo = custo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String obterProduto(){
        return "Produto{" +
                "nome='" + this.getNome() + '\'' +
                ", setor='" + this.getSetor().getNome() + '\'' +
                ", custo='" + this.getCusto() + '\'' +
                '}';
    }
}
