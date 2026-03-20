package br.senai.LojaProduto.service;

import br.senai.LojaProduto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public Produto cadastrarProduto(Produto produto){
        produtos.add(produto);
        return produto;
    }

    public List<Produto> buscarProdutos(){
        return produtos;
    }

    public Optional<Produto> buscarProdutoPorCodigo(Long codigo){
        return produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();
    }

    public Optional<Produto> alterarProduto(Long codigo, Produto produtoAtualizado){
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setPreco(produtoAtualizado.getPreco());
                return Optional.ofNullable(produto);
            }
        }

        return Optional.empty();
    }

    public boolean excluirProduto(Long codigo){
        return produtos.removeIf(p -> p.getCodigo().equals(codigo));
    }

}
