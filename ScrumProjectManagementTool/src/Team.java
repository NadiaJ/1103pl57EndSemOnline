import java.util.ArrayList;


public class Team {
	
	private Project project;
	private int velocity;
	private int capacity;
	private ArrayList<Person> team=new ArrayList<Person>();
	
	
	public int getCapacity() {
		
		return this.team.size();
	}

	
	public Project getPoject() {
		return project;
	}

	public void setPoject(Project poject) {
		this.project = poject;
	}

	public int getVelocity() {
		return velocity;
	}
	
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public ArrayList<Person> getTeam() {
		return team;
	}
	
	public void setTeam(ArrayList<Person> team) {
		this.team = team;
	}
	
	
}
