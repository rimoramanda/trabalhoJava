package com.amanda.people.service;

import com.amanda.people.dto.request.PersonRequestDTO;
import com.amanda.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {
//metodos que serao implementados

    //aqui eu nao quero ter que passar um id para registrar um usuario entao dentro do dto>req>resp
    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(PersonRequestDTO personDTO);

    String delete(Long id);
}
