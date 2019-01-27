package DockerGroup.DockerBoot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DockerGroup.DockerBoot.model.DockerBootModel;
import DockerGroup.DockerBoot.service.DockerBootServiceInterface;

@RestController
@RequestMapping("/")
public class AppController {

	@Autowired
	DockerBootServiceInterface repo;

	@GetMapping("/getDockerImage")
	public String getDockerImage(HttpServletRequest request) {
		System.out.println("This is Docker image from Spring Boot application");
		String hostAddress = request.getRequestURL().toString();
		System.out.println("Host Address is " + hostAddress);
		return "hello Dcoker Docker";
	}

	@GetMapping("/test")
	public String getTest(HttpServletRequest request) {
		System.out.println("This is Docker image from Spring Boot application");
		String hostAddress = request.getRequestURL().toString();
		System.out.println("Host Address is " + hostAddress);
		return "hello Docker called from " + hostAddress + " test docker URI";
	}

	@GetMapping("/getDockerBoot")
	public List<DockerBootModel> getDockerBoot() {
		List<DockerBootModel> ls = repo.getDockerBootModels();
		return ls;
	}

	@GetMapping("/getDockerBoot/{name}")
	public DockerBootModel getDockerBootByName(@PathVariable("name") String name) {

		return repo.getDockerName(name);
	}
}
