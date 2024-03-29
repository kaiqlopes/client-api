package com.studyingkaiq.clientcrud.repositories;

import com.studyingkaiq.clientcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(nativeQuery = true, value = "SELECT client.id, client.name, client.cpf, client.income, client.birth_date, client.children " +
            "FROM tb_client AS client " +
            "WHERE LOWER(client.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Client> findByName(@Param("name") String name);

}
