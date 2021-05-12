package mavenPractice.Maven;

import org.testng.annotations.Test;

public class SecondTest {

	public class FirstTest {
		
		@Test
		public void first() {
			
			System.out.println("SecondFirst");
		}
		
		@Test
		public void second() {
			
			System.out.println("SecondSecond");
		}
	
}
}
