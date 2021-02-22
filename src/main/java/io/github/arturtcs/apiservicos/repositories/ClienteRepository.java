package io.github.arturtcs.apiservicos.repositories;

import io.github.arturtcs.apiservicos.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
