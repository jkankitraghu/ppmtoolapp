package in.codeblog.ppmapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codeblog.ppmapi.domain.Project;
import in.codeblog.ppmapi.repository.ProjectRepository;

@Service
public class ProjectService {
	
@Autowired	
 private ProjectRepository projectRepository;
public Project saveoOrUpdate(Project project) {
	return projectRepository.save(project);
}
}
