package testtriangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {


	private Triangle t;
	
	@Before
	public void setUp() throws Exception{
		t = new Triangle();
	}
	
	@Test
	public void testisLegal() {
		
		assertFalse(t.isLegal(-1,-2,-2));
		assertTrue(t.isLegal(5,6,7));
	}
	
	@Test
	public void testisEquilateral() {
		
		assertFalse(t.isEquilateral(1,2,2));
		assertTrue(t.isEquilateral(2,2,2));
	}
	
	@Test
	public void testisIsosceles() {
		
		assertFalse(t.isIsosceles(3,4,2));
		assertTrue(t.isIsosceles(1,2,2));
	}
	
	@Test
	public void testisScalene() {
		
		assertFalse(t.isScalene(1,2,2));
		assertTrue(t.isScalene(5,2,4));
	}
	
	

}
