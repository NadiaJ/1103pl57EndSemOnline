import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PersonTest extends TestCase {

	Person person;
	
	public void setUp() throws Exception {
		
		person=new Person();
		person.setName("Krishna");
		person.setRole("Scrum Master");
	}

	@After
	public void tearDown() throws Exception {
	}

	public void testSetName() {
		
		assertEquals("Krishna",person.getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetRole() {
		
		assertEquals("Scrum Master",person.getRole());
	}

}
