package br.senai.LojaProduto.service;

import br.senai.LojaProduto.model.Categoria;
import br.senai.LojaProduto.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void cadastrarCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

}
