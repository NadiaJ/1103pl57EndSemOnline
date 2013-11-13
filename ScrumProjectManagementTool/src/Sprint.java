import java.util.ArrayList;


public class Sprint {
	
	private int sprintno;
	private String duration;
	private ArrayList<Story> stories=new ArrayList<Story>();
	private Team team;
	
	public int getSprintno() {
		return sprintno;
	}
	public void setSprintno(int sprintno) {
		this.sprintno = sprintno;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public ArrayList<Story> getStories() {
		return stories;
	}
	public void setStories(ArrayList<Story> stories) {
		this.stories = stories;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
}
