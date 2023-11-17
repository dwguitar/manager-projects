package dw.com.projectmanager.service.Impl;

import dw.com.projectmanager.domain.Person;
import dw.com.projectmanager.domain.Project;
import dw.com.projectmanager.dto.ProjectDTO;
import dw.com.projectmanager.mapper.ProjectMapper;
import dw.com.projectmanager.repository.ProjectRepository;
import dw.com.projectmanager.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    private final ProjectMapper mapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper mapper) {
        this.projectRepository = projectRepository;
        this.mapper = mapper;
    }



    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.getReferenceById(id);
    }

    @Override
    public Project updateProject(Long id) {
        Project projectDB = projectRepository.getReferenceById(id);
        if (Objects.nonNull(projectDB)) {
            return projectDB;
        }
        return new Project();
    }

    @Override
    public void deleteProject(Long id) {
        Project projectDB = projectRepository.getReferenceById(id);
        projectRepository.delete(projectDB);
    }
}
