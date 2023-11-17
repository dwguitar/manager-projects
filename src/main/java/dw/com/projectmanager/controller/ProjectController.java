package dw.com.projectmanager.controller;

import dw.com.projectmanager.domain.Project;
import dw.com.projectmanager.dto.ProjectDTO;
import dw.com.projectmanager.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProjectDTO>> getAllProject() {
        List<Project> projectList = projectService.getAllProject();

        List<ProjectDTO> projectDTOList = projectList.stream()
                .map(ProjectDTO::mapFromProject)
                .collect(Collectors.toList());
        return ResponseEntity.ok(projectDTOList);
    }
}
