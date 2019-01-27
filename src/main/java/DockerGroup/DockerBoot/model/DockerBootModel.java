/**
 * 
 */
package DockerGroup.DockerBoot.model;

/**
 * @author Sairam Prasad Vanamala
 *
 */
public class DockerBootModel {

	private String dockerName;
	private String dockerRepository;
	/**
	 * @return the dockerName
	 */
	public String getDockerName() {
		return dockerName;
	}
	/**
	 * @param dockerName the dockerName to set
	 */
	public void setDockerName(String dockerName) {
		this.dockerName = dockerName;
	}
	/**
	 * @return the dockerRepository
	 */
	public String getDockerRepository() {
		return dockerRepository;
	}
	/**
	 * @param dockerRepository the dockerRepository to set
	 */
	public void setDockerRepository(String dockerRepository) {
		this.dockerRepository = dockerRepository;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dockerName == null) ? 0 : dockerName.hashCode());
		result = prime * result + ((dockerRepository == null) ? 0 : dockerRepository.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DockerBootModel other = (DockerBootModel) obj;
		if (dockerName == null) {
			if (other.dockerName != null)
				return false;
		} else if (!dockerName.equals(other.dockerName))
			return false;
		if (dockerRepository == null) {
			if (other.dockerRepository != null)
				return false;
		} else if (!dockerRepository.equals(other.dockerRepository))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DockerBootModel [dockerName=");
		builder.append(dockerName);
		builder.append(", dockerRepository=");
		builder.append(dockerRepository);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param dockerName
	 * @param dockerRepository
	 */
	public DockerBootModel(String dockerName, String dockerRepository) {
		super();
		this.dockerName = dockerName;
		this.dockerRepository = dockerRepository;
	}
	
	
}
