package br.senai.LojaProduto.service;

import br.senai.LojaProduto.dao.ProdutoDAO;
import br.senai.LojaProduto.model.Produto;
import br.senai.LojaProduto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

//    private final ProdutoDAO produtoDAO;
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto cadastrarProduto(Produto produto){
//        produtoDAO.salvar(produto);
        produtoRepository.save(produto);
        return produto;
    }

    public List<Produto> buscarProdutos(){
//        List<Produto> produtos = produtoDAO.listarTodos();
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    public Optional<Produto> buscarProdutoPorCodigo(Long codigo){
//        Produto produto = produtoDAO.buscarPorCodigo(codigo);
        Optional<Produto> produto = produtoRepository.findById(codigo);
        return produto;
    }

    public Optional<Produto> alterarProduto(Long codigo, Produto produto){
//        produto.setCodigo(codigo);
//        produtoDAO.atualizar(produto);
        Produto saved = produtoRepository.save(produto);
        return Optional.of(saved);
    }

    public boolean excluirProduto(Long codigo){
//        produtoDAO.excluir(codigo);
        produtoRepository.deleteById(codigo);
        return true;
    }

}
