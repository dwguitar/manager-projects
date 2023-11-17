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
    private Person person;
    private List<Member> members;

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
        projectDTO.setPerson(project.getPerson());
        projectDTO.setMembers(project.getMembers());


        return projectDTO;
    }
}
