package dw.com.projectmanager.service;

import dw.com.projectmanager.domain.Project;

import java.util.List;


public interface ProjectService {

    void save(Project project);

    List<Project> getAllProject();

    Project getProjectById(Long id);

    Project updateProject(Long id);

    void deleteProject(Long id);
}
