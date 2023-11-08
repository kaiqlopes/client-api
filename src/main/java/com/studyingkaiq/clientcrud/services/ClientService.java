package com.studyingkaiq.clientcrud.services;

import com.studyingkaiq.clientcrud.dtos.ClientDTO;
import com.studyingkaiq.clientcrud.entities.Client;
import com.studyingkaiq.clientcrud.services.exceptions.DatabaseException;
import com.studyingkaiq.clientcrud.repositories.ClientRepository;
import com.studyingkaiq.clientcrud.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client result = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
        return new ClientDTO(result);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert(ClientDTO client) {
        Client entity = new Client();
        copyDtoToClient(entity, client);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO client) {
        Client entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
        copyDtoToClient(entity, client);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Resource not found");
        }

        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Referential Integrity violation");
        }
    }

    @Transactional(readOnly = true)
    public List<ClientDTO> findByName(String name) {
        List<Client> result = repository.findByName(name);
        if (result.isEmpty()) {
            throw new ResourceNotFoundException("Resource not found");
        }
        return result.stream().map(ClientDTO::new).toList();
    }

    public void copyDtoToClient(Client client, ClientDTO dto) {
        client.setName(dto.getName());
        client.setCpf(dto.getCpf());
        client.setIncome(dto.getIncome());
        client.setBirthDate(dto.getBirthDate());
        client.setChildren(dto.getChildren());
    }

}
