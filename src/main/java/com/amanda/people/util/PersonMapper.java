package com.amanda.people.util;

import com.amanda.people.dto.request.PersonRequestDTO;
import com.amanda.people.dto.response.PersonResponseDTO;
import com.amanda.people.entity.Person;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonMapper {
    public Person toPerson(PersonRequestDTO personDTO){

        //converter um dto em uma person(entidade)
        return Person.builder()
                .name(personDTO.getName())
                .cpf(personDTO.getCpf())
                .age(personDTO.getAge())
                .build();
    }
    //aqui converter entidade para dto
    public PersonResponseDTO toPersonDTO(Person person){
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList){

        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO personDTO){

        person.setName(personDTO.getName());
        person.setCpf(personDTO.getCpf());
        person.setAge(personDTO.getAge());
    }
}
