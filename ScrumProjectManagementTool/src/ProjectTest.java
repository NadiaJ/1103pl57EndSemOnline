import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ProjectTest extends TestCase {

	Project project;
	@Before
	public void setUp() throws Exception {
		
		project=new Project(3,"Online Voting System");
		
	}

	@After
	public void tearDown() throws Exception {
		
		project=null;
	}

	@Test
	public void testSetProjectName() {
		assertEquals("Online Voting System",project.getProjectName());
		assertNotSame(2,project.getProjectid());
		//fail("Not yet implemented");
	}

}
