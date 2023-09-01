package br.senai.lab365.Aula1.controller;

import br.senai.lab365.Aula1.model.Cliente;
import br.senai.lab365.Aula1.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService service;

    @PostMapping
    public void inserir(@RequestBody Cliente cliente){
        service.inserir(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.list();
    }
}
