package br.senai.lab365.Aula1.service;

import br.senai.lab365.Aula1.model.Cliente;
import br.senai.lab365.Aula1.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public void inserir(Cliente cliente){
        repository.save(cliente);
    }

    public List<Cliente> list(){
        return repository.findAll();
    }
}