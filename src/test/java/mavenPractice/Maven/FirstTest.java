package mavenPractice.Maven;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void first() {
		
		System.out.println("First");
	}
	
	@Test(priority=1)
	public void second() {
		
		System.out.println("Second");
	}
	
@Test(priority=3)
	public void third() {
		
		System.out.println("Third");
	}
	
	@Test(priority=4)
	public void fourth() {
		
		System.out.println("fourth");
	}
	

}
