package swColaborativo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	
    @Before
    public void before() {
        user = new User(1, "fabricio", "flores");
    }

	@Test
	public void testUser() {
		assertEquals(1, user.getNumber());
		assertTrue(user.getName().equals("Fabricio"));
		assertTrue(user.getFamilyName().equals("Flores"));
	}

	@Test
	public void testFullName() {
		assertTrue(user.fullName().equals("Fabricio Flores"));
	}

	@Test
	public void testInitials() {
		assertTrue(user.initials().equals("F."));
	}

	@Test
	public void testgetNumer() {
		assertEquals(1, user.getNumber());
	}

	@Test
	public void testgetName() {
		assertTrue(user.getName().equals("Fabricio"));
	}

	@Test
	public void testgetFamilyName() {
		assertTrue(user.getFamilyName().equals("Flores"));
	}
	
	@Test
	public void testNombreInicialApellido(){
		assertTrue(user.nombreInicialApellido().equals("Fabricio F."));
	}

}
