package br.senai.lab365.Aula1.service;

import br.senai.lab365.Aula1.model.Produto;
import br.senai.lab365.Aula1.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public void inserir(Produto produto){
        repository.save(produto);
    }

    public List<Produto> list(){
        return repository.findAll();
    }
}
