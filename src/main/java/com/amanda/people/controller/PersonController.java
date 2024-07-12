package com.amanda.people.controller;

import com.amanda.people.dto.request.PersonRequestDTO;
import com.amanda.people.dto.response.PersonResponseDTO;
import com.amanda.people.entity.Person;
import com.amanda.people.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    @GetMapping(value = "/{id}")
    private ResponseEntity findByid(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(personService.findById(id));
    }
    @GetMapping
    private ResponseEntity<List<PersonResponseDTO>> findAll(){
        return ResponseEntity.ok().body(personService.findAll());
    }

    @PostMapping
    private ResponseEntity<PersonResponseDTO> register (@RequestBody PersonRequestDTO personRequestDTO, UriComponentsBuilder uriBuilder){

        PersonResponseDTO personResponseDTO = personService.register(personRequestDTO);

        URI uri = uriBuilder.path("/people/{id}").buildAndExpand(personResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(personResponseDTO);
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<PersonResponseDTO> update (@RequestBody PersonRequestDTO personDTO,@PathVariable(name = "id") Long id){

        return ResponseEntity.ok().body(personService.update(id,personDTO));
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(personService.delete(id));
    }

}
