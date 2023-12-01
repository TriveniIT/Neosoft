package testNGPractice;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test (groups = {"Sanity Testing"}, priority=2)
  public void A() {
	  
	  System.out.println("Test1 for pushing github");
  }
  
  @Test (groups = {"Smoke Testing"})
  public void B() {
	  
	  System.out.println("Test2 for github");
  }
  
  @Test (groups = {"Sanity Testing"},priority=1)
  public void C() {
	  System.out.println("Test3");
	  
  }
  @Test (groups = {"Regression Testing"})
  public void D() {
	  
	  System.out.println("Test4");
  }
}
