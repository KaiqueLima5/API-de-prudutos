package org.example.model;

public class Produto {

    private Long codigo;
    private String nome;
    private String descricao;
    private Double preco;
    private int quatEmEstoque;

    public Produto() {}

    public Produto(Long codigo, String nome, String descricao, Double preco, int quatEmEstoque){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quatEmEstoque = quatEmEstoque;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuatEmEstoque() {
        return quatEmEstoque;
    }

    public void setQuatEmEstoque(int quatEmEstoque) {
        this.quatEmEstoque = quatEmEstoque;
    }
}