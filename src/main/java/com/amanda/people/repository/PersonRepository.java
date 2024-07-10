package com.amanda.people.repository;

import com.amanda.people.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//aqui liga com banco de dados
//JPA-é ela que defino como os objetos Java podem ser persistidos em um banco relacional
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
