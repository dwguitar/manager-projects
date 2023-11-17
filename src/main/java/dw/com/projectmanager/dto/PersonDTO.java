package dw.com.projectmanager.dto;

import dw.com.projectmanager.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String cpf;
    private Boolean employee;

    public static PersonDTO mapFromPerson(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setBirthDate(person.getBirthDate());
        personDTO.setCpf(person.getCpf());
        personDTO.setEmployee(person.getEmployee());

        return personDTO;
    }
}
