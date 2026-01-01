package com.tp.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tp.springbootdemo.entities.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

}
