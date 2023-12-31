package com.colabuco.aprendendospring.service;

import com.colabuco.aprendendospring.model.Cliente;
import com.colabuco.aprendendospring.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(Cliente cliente){
       return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> retornarClientePeloId(long id){
        return clienteRepository.findById(id);
    }

    public Cliente retornarClientePeloNome(String nome){
        return clienteRepository.findBy(nome);
    }
}
