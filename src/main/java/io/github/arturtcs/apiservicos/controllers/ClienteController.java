package io.github.arturtcs.apiservicos.controllers;

import io.github.arturtcs.apiservicos.entities.Cliente;
import io.github.arturtcs.apiservicos.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Integer id) {
        return repository
                .findById(id)
                .orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
