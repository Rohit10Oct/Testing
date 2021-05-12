package mavenPractice.Maven;

import org.testng.annotations.Test;

public class FourthTest {
	
	
	@Test(groups={"Smoke"})
	public void Fourthfirst() {
		
		System.out.println("FourthFirst");
	}
	
	@Test(groups={"Regression"})
	public void Fourthsecond() {
		
		System.out.println("FourthSecond");
	}

}
