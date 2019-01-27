package DockerGroup.DockerBoot.service;

import java.util.List;

/**
 * @author admin
 *
 */

import DockerGroup.DockerBoot.model.DockerBootModel;

public interface DockerBootServiceInterface {

	public List<DockerBootModel> getDockerBootModels();

	public DockerBootModel getDockerName(String dockerName);
}
