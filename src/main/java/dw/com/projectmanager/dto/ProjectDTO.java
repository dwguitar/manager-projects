package dw.com.projectmanager.dto;

import dw.com.projectmanager.domain.Member;
import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.domain.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {

    private Long id;
    private String name;
    private LocalDate initialDate;
    private LocalDate expectedEndDate;
    private LocalDate endDate;
    private String description;
    private String status;
    private BigDecimal orcamento;
    private String risco;
    private PersonDTO person;
    private List<MemberDTO> members;

    public static ProjectDTO mapFromProject(Project project) {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        projectDTO.setDescription(project.getDescription());
        projectDTO.setEndDate(project.getEndDate());
        projectDTO.setInitialDate(project.getInitialDate());
        projectDTO.setExpectedEndDate(project.getExpectedEndDate());
        projectDTO.setOrcamento(project.getOrcamento());
        projectDTO.setRisco(project.getRisco());
        projectDTO.setStatus(project.getStatus());
        projectDTO.setPerson(mapFromPerson(project.getPerson()));
        projectDTO.setMembers(mapFromMember(project.getMembers()));


        return projectDTO;
    }

    public static PersonDTO mapFromPerson(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setCpf(person.getCpf());
        personDTO.setName(person.getName());
        personDTO.setBirthDate(person.getBirthDate());
        personDTO.setEmployee(person.getEmployee());
        return personDTO;
    }

    public static List<MemberDTO> mapFromMember(List<Member> members) {
        return members.stream()
                .map(MemberDTO::mapFromMember)
                .collect(Collectors.toList());
    }



}
