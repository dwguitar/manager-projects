package dw.com.projectmanager.controller;

import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.dto.PersonDTO;
import dw.com.projectmanager.mapper.PersonMapper;
import dw.com.projectmanager.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @PostMapping("/save")
    public ResponseEntity<PersonDTO> savePerson(@RequestBody PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);
        personService.save(person);
        PersonDTO responseData = personMapper.toDTO(person);
        return ResponseEntity.ok(responseData);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonDTO>> getAllPerson() {
        List<Person> personList = personService.getAllPerson();
        List<PersonDTO> personDTOList = personList.stream()
                .map(PersonDTO::mapFromPerson)
                .collect(Collectors.toList());
        return ResponseEntity.ok(personDTOList);

    }

}
