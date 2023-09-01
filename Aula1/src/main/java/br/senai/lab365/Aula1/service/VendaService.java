package br.senai.lab365.Aula1.service;

import br.senai.lab365.Aula1.model.Cliente;
import br.senai.lab365.Aula1.model.Produto;
import br.senai.lab365.Aula1.model.Venda;
import br.senai.lab365.Aula1.repository.ClienteRepository;
import br.senai.lab365.Aula1.repository.ProdutoRepository;
import br.senai.lab365.Aula1.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final VendaRepository vendaRepository;

    public Venda venda(Long produtoId, Long clienteId, Double desconto) {

        Cliente cliente = clienteRepository.findById(clienteId).get();

        Produto produto = (Produto) produtoRepository.findById(produtoId).get();

        return vendaRepository.save(new Venda(cliente,produto,desconto));

    }
}

