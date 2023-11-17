package dw.com.projectmanager.mapper;

import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    @Mapping(target = "id", ignore = true)
    Person toEntity(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
