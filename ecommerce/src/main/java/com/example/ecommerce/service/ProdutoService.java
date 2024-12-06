package com.example.ecommerce.service;

import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para salvar o produto
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Método para deletar produto
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

    // Método para listar todos os produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Método para buscar produto por ID
    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }
}
