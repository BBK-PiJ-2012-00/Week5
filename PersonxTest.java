import org.junit.*;
import static org.junit.Assert.*;

	public class PersonxTest {
		@Test	
		public void testsNormalName() {
			Personx p = new Personx();
			String input = "Dereck Robert Yssirt";
			String output = p.getInitials(input);
			String expected = "DRY";
			assertEquals(output, expected);
		}
		
		@Test		
		public void testsDodgyName() {
			Personx a = new Personx();
			String input = "Dereck  Robert  Yssirt";
			String output = a.getInitials(input);
			String expected = "DRY";
			assertEquals(output, expected);
		}
		 
		@Test		
		public void testsSpaceRemoval() {
			Personx p = new Personx();
			String input = "Dereck  Robert  Yssirt";
			String output = p.removeDuplicateSpaces(input);
			String expected = "Dereck Robert Yssirt";
			assertEquals(output, expected);
		}
			
	}
	
	
	
	
/**
1. Find the bug again. Repeat the same steps until you know exactly how and when the bug
appears. This is called reproducing the bug and it is not always easy in large, complicated
programs.
2. Once you have been able to reliably reproduce the bug manually, write a test that reproduces
the bug programmatically. Check that the bug is always fired when you run your test with
JUnit. Make the test as simple as possible.
3. Once you have written the simplest test that reproduces the bug —and only then— fix the
bug. Verify that the tests passes.
*/