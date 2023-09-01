package br.senai.lab365.Aula1.repository;

import br.senai.lab365.Aula1.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface VendaRepository extends JpaRepository<Venda,Long> {
}
