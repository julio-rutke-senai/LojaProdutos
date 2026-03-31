package br.senai.LojaProduto.service;

import br.senai.LojaProduto.dao.ProdutoDAO;
import br.senai.LojaProduto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Produto cadastrarProduto(Produto produto){
        produtoDAO.salvar(produto);
        return produto;
    }

    public List<Produto> buscarProdutos(){
        List<Produto> produtos = produtoDAO.listarTodos();
        return produtos;
    }

    public Optional<Produto> buscarProdutoPorCodigo(Long codigo){
        Produto produto = produtoDAO.buscarPorCodigo(codigo);
        return Optional.ofNullable(produto);
    }

    public Optional<Produto> alterarProduto(Long codigo, Produto produto){
        produto.setCodigo(codigo);
        produtoDAO.atualizar(produto);
        return Optional.of(produto);
    }

    public boolean excluirProduto(Long codigo){
        produtoDAO.excluir(codigo);
        return true;
    }

}
