
public class Project {

	public Project(int projectid, String projectname) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
	}

	private int projectid;
	private String projectname;
	
	public int getProjectid() {
		return projectid;
	}


	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}


	public void setProjectName(String name) {
		this.projectname=name;
		
	}

	public String getProjectName() {
		// TODO Auto-generated method stub
		return this.projectname;
	}
	
}
