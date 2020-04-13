package in.codeblog.ppmapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codeblog.ppmapi.domain.Project;
import in.codeblog.ppmapi.service.ProjectService;


@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> saveProject(@RequestBody Project project){
		Project proj=projectService.saveoOrUpdate(project);
		return new ResponseEntity<Project>(proj,HttpStatus.CREATED);
	}
}
