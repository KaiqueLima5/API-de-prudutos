package org.example.service;

import org.example.model.Produto;
import org.example.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado){
        Produto produto = produtoRepository.findById(id).orElse(null);

        if(produto != null){
            produto.setNome(produtoAtualizado.getNome());
            produto.setDescricao(produtoAtualizado.getDescricao());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setQuatEmEstoque(produtoAtualizado.getQuatEmEstoque());

            return produtoRepository.save(produto);
        }

        return null;
    }
}