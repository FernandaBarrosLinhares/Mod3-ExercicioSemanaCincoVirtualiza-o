package br.senai.lab365.Aula1.controller;

import br.senai.lab365.Aula1.model.Venda;
import br.senai.lab365.Aula1.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
@RequiredArgsConstructor
public class VendaController {
    private final VendaService service;

    @PostMapping
    public Venda inserir(
            @RequestParam Long produtoId,
            @RequestParam Long clienteId,
            @RequestParam Double desconto
    ){

        return service.venda(produtoId, clienteId, desconto);
    }

}
