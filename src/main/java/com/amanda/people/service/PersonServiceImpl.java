package com.amanda.people.service;

import com.amanda.people.dto.request.PersonRequestDTO;
import com.amanda.people.dto.response.PersonResponseDTO;
import com.amanda.people.repository.PersonRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PersonServiceImpl implements PersonService{

    //injetar a dependencia do repository aqui
    private PersonRepository personRepository;

    @Override
    public PersonResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return null;
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {
        return null;
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
