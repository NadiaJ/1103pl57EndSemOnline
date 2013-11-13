import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class ScrumFramework {

	InputStreamReader istream = new InputStreamReader(System.in) ;
	BufferedReader bufRead = new BufferedReader(istream) ;
	Project project=new Project();
	Team team=new Team();
	Sprint sprint=new Sprint();
	
	
	public void createProject()
	{
		
		
		try{
		System.out.println("Enter project Id");
		project.setProjectid(Integer.parseInt(bufRead.readLine()));
		System.out.println("Enter project Name"); 
		project.setProjectName(bufRead.readLine());
		System.out.println("Project Created");
		}
		catch (IOException err) {
		     System.out.println("Error reading line");
		}
		
	}
	
	public void createTeam()
	{
		Team team=new Team();
		String str;
		
		try{
			System.out.println("Enter Names for the Roles below");
			
			System.out.println("Product Owner");
			str=bufRead.readLine();
			team.getTeam().add(new Person("p1",str,"Product Owner"));
			
			System.out.println("Scrum Master");
			str=bufRead.readLine();
			team.getTeam().add(new Person("p2",str,"Scrum Master"));
			
			System.out.println("Customer");
			str=bufRead.readLine();
			team.getTeam().add(new Person("p3",str,"Customer"));
			
			System.out.println("Team Member");
			str=bufRead.readLine();
			team.getTeam().add(new Person("p4",str,"Team Member"));
			System.out.println("Team Member");
			str=bufRead.readLine();
			
			team.getTeam().add(new Person("p5",str,"Team Member"));
			System.out.println("Product Owner");
			str=bufRead.readLine();
			
			team.getTeam().add(new Person("p6",str,"Team Member"));
			
			System.out.println("Team Created");
			
			}
			catch (IOException err) {
			     System.out.println("Error reading line");
			}
		
	}

	public ArrayList<Story> defineStories()
	{
		String story;
		int sp,i;
		int priority;
		String reply="Y";
		ArrayList<Story> stories= new ArrayList<Story>();
		
		try{
			
			while(reply == "Y")
			{
				i=1;
			
			System.out.println("Define Stories and assign SP value(1- 5) and priority");
			System.out.println("Story"+i);
			story=bufRead.readLine();
			System.out.println("SP");
			sp=Integer.parseInt(bufRead.readLine());
			
			while(!validatestorypt(sp))
			{
				sp=Integer.parseInt(bufRead.readLine());
			}
			
			System.out.println("Priority (1-10)");
			priority=Integer.parseInt(bufRead.readLine());
			

			while(!validatepriority(priority))
			{
				priority=Integer.parseInt(bufRead.readLine());
			}
			
			stories.add(new Story(story,sp,priority));
			i++;
			System.out.println("Do you want to continue adding more stories??(Enter:Y/N)");
			reply=bufRead.readLine();
			}
		}
		catch (IOException err) {
		     System.out.println("Error reading line");
		}
		
		return stories;
		
		
	}
		
	
	public Sprint createSprint()
	{
		
	
		try{
			System.out.println("Enter Sprint details");
			System.out.println("Sprint No");
			sprint.setSprintno(Integer.parseInt(bufRead.readLine()));
			System.out.println("Sprint duration");
			sprint.setDuration(bufRead.readLine());
			}
		
		catch (IOException err) {
		     System.out.println("Error reading line");
		     
		}
		return sprint;
	}
	
	
	public Sprint assignStoriestoSprint(Sprint s1, ArrayList<Story> s)
	{
		String reply="";
		int total=0;
		ArrayList<Story> temp=new ArrayList<Story>();
		try{
			
			
		
		for(Story s2:s)
		{
			System.out.println("Story");
			System.out.println(s2.getStory());
			System.out.println(s2.getStorypoint());
			System.out.println(s2.getPriority());
			System.out.println("Add story to sprint??(Y/N)");
			reply=bufRead.readLine();
			total+=s2.getStorypoint();
			if((reply == "Y")&&(total!=20))
			{
				temp.add(s2);
				
			}
			else
			{
				total-=s2.getStorypoint();
			}
		}
				
		}
	
		catch (IOException err) {
		     System.out.println("Error reading line");
		     
		}
		
		return s1;
		
		
	}
	
	
			public boolean validatestorypt(int i)
			{
				if((i<1)||(i>5))
				{
					System.out.println("Invalid value for Story point.Enter Again");
					return false;
				}
				return true;
			}
			
			public boolean validatepriority(int i)
			{
				if((i<1)||(i>10))
				{
					System.out.println("Invalid value for Priority.Enter Again");
					return false;
				}
				return true;
			}
			
		
	}
	
	
	
	
	

