package tests;

import java.util.Date;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import model.Registrant;

public class TestCheckin2 {
	String message = "Robert";
	Date now = new Date();
	Registrant dick = new Registrant("Dick Mueller", "234625");

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testValidCheckinTime() {
		System.out.println("Testing null checkin time (not checked in)...");
		assertNull(dick.getCheckinTime());
	}

}
