import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TeamTest extends TestCase {

	Project p1,p2;
	
	Team t1,t2;
	
	public void setUp() throws Exception {
		
		p2=new Project(3,"online Voting System");
		t1=new Team();
		t2=new Team();
		t1.setPoject(p2);
		t1.setVelocity(20);
		t2.setPoject(p1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetproject() {
		assertEquals("online Voting System",t1.getPoject().getProjectName());
		assertNull(t2.getPoject());
	}

	public void testSetvelocity()
	{
		assertEquals(20,t1.getVelocity());
	}
}
