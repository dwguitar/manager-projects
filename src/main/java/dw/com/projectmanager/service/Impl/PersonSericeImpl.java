package dw.com.projectmanager.service.Impl;

import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.repository.PersonRepository;
import dw.com.projectmanager.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PersonSericeImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonSericeImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void save(Person person) {
       personRepository.save(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public Person updatePerson(Long id) {
        Person personDB = personRepository.getReferenceById(id);
        if (Objects.nonNull(personDB)) {
            return personDB;
        }
        return new Person();

    }

    @Override
    public void deletePerson(Long id) {
       Person personDB = personRepository.getReferenceById(id);
       personRepository.delete(personDB);
    }
}
