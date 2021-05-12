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
	
	

}
