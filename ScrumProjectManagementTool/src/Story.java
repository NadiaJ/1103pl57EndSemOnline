import java.util.ArrayList;


public class Story {
	
	private String story;
	private int storypoint;
	private int priority;
	private ArrayList<Task> task=new ArrayList<Task>();
	
	public ArrayList<Task> getTask() {
		return task;
	}


	public void setTask(ArrayList<Task> task) {
		this.task = task;
	}


	public Story(String story, int storypoint, int priority) {
		super();
		this.story = story;
		this.storypoint = storypoint;
		this.priority = priority;
	}
	
	
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getStorypoint() {
		return storypoint;
	}
	public void setStorypoint(int storypoint) {
		this.storypoint = storypoint;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
