package io.github.arturtcs.apiservicos.repositories;

import io.github.arturtcs.apiservicos.entities.Cliente;
import io.github.arturtcs.apiservicos.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
