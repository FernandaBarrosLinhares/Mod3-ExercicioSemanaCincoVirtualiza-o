package br.senai.lab365.Aula1.controller;

import br.senai.lab365.Aula1.model.Produto;
import br.senai.lab365.Aula1.repository.ProdutoRepository;
import br.senai.lab365.Aula1.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoService service;

    @PostMapping
    public void inserir(@RequestBody Produto produto){
        service.inserir((Produto) produto);
    }

    @GetMapping
    public List<Produto> listar(){
        return service.list();
    }
}
