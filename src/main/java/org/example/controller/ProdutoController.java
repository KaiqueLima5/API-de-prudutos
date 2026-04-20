package org.example.controller;

import org.example.model.Produto;
import org.example.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
        return produtoService.adicionar(produto);
    }

    // EXTRA: adicionar vários produtos de uma vez
    @PostMapping("/lote")
    public List<Produto> adicionarVarios(@RequestBody List<Produto> produtos){
        for (Produto produto : produtos){
            produtoService.adicionar(produto);
        }
        return produtos;
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtoService.deletar(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto){
        return produtoService.atualizar(id, produto);
    }

}