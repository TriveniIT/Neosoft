package testNGPractice;

import org.testng.annotations.Test;

public class Grouping {
  @Test (groups = {"Smoke Testing"})
  public void E() {
	  
	  System.out.println("Test5");
  }
  
  @Test (groups = {"Regression Testing"})
  public void F() {
	  
	  System.out.println("Test6");
  }
  
  @Test (groups = {"Sanity Testing"})
  public void G() {
	  
	  System.out.println("Test7");
  }
}
