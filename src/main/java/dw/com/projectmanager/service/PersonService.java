package dw.com.projectmanager.service;

import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.dto.PersonDTO;

import java.util.List;

public interface PersonService {

    void save(Person person);

    List<Person> getAllPerson();

    Person getPersonById(Long id);

    Person updatePerson(Long id);

    void deletePerson(Long id);
}
