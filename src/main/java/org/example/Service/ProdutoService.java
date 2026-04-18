package org.example.service;

import org.example.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();

    public ProdutoService(){
        produtos.add(new Produto(1L, "Notebook Gamer", "Notebook potente", 5000.0, 5));
        produtos.add(new Produto(2L, "Mouse Gamer", "Mouse RGB", 150.0, 20));
    }

    public List<Produto> listarTodos(){
        return produtos;
    }

    public Produto adicionar(Produto produto){
        Long novoCodigo = (long) (produtos.size() + 1);
        produto.setCodigo(novoCodigo);
        produtos.add(produto);
        return produto;
    }
}