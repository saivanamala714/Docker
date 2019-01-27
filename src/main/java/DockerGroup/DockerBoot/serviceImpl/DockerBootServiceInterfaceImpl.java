/**
 * 
 */
package DockerGroup.DockerBoot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import DockerGroup.DockerBoot.model.DockerBootModel;
import DockerGroup.DockerBoot.service.DockerBootServiceInterface;

/**
 * @author admin
 *
 */
@Service
public class DockerBootServiceInterfaceImpl implements DockerBootServiceInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see DockerGroup.DockerBoot.service.DockerBootServiceInterface#
	 * getDockerBootModels()
	 */
	public List<DockerBootModel> getDockerBootModels() {
		List<DockerBootModel> ls = getDockerBootList();

		return ls;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * DockerGroup.DockerBoot.service.DockerBootServiceInterface#getDockerName(
	 * java.lang.String)
	 */
	public DockerBootModel getDockerName(String dockerName) {
		List<DockerBootModel> ls = getDockerBootList();
		DockerBootModel dbm;

		dbm = ls.stream().filter(service -> dockerName.equalsIgnoreCase(service.getDockerName())).findAny().get();
		return dbm;
	}

	public List<DockerBootModel> getDockerBootList() {
		List<DockerBootModel> ls = new ArrayList<DockerBootModel>();

		DockerBootModel dbm = new DockerBootModel("Sai", "saivanamalaDocker");
		ls.add(dbm);
		DockerBootModel dbm1 = new DockerBootModel("Hari", "HariDocker");
		ls.add(dbm1);
		return ls;
	}

}
