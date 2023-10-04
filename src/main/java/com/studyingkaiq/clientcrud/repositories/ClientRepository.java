package com.studyingkaiq.clientcrud.repositories;

import com.studyingkaiq.clientcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
