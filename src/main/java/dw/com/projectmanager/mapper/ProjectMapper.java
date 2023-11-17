package dw.com.projectmanager.mapper;

import dw.com.projectmanager.domain.Project;
import dw.com.projectmanager.dto.ProjectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {MemberMapper.class})
public interface ProjectMapper {
    @Mapping(target = "id", ignore = true)
    Project toEntity(ProjectDTO projectDTO);

    ProjectDTO toDTO(Project project);
}

