package br.senai.lab365.Aula1.repository;

import br.senai.lab365.Aula1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
