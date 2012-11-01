import org.junit.*;
import static org.junit.Assert.*;

	public class UserTest {
		@Test
		public void testsUsernameGetter() {
			String inputUsername = "Klaus";
			User u = new UserImpl(inputUsername);
			String outputUsername = u.getUsername();
			String expectedUsername = inputUsername;
			assertEquals(outputUsername, expectedUsername);
		}
		
		@Test
		public void testsIDSetter() {
			User u = new UserImpl("Klaus");
			int inputID = 1123;
			u.setID(inputID);
			int outputID = u.getID();
			int expectedID = inputID;
			assertEquals(outputID, expectedID);
		}
		
		@Test
		public void testsIDgetter() {
			User u = new UserImpl("Klaus");
			int inputID = 4456;
			u.setID(inputID);
			int outputID = u.getID();
			int expectedID = inputID;
			assertEquals(outputID, expectedID);
		}	

		@Test
		public void testsRegisterLibraryID() {
			MockLibrary mock = new MockLibrary();
			User u = new UserImpl("Klaus");
			u.register(mock);
			int inputID = mock.getAssignedID();
			int outputID = u.getID();
			int expectedID = inputID;
			assertEquals(outputID, expectedID);
		}
		
		@Test
		public void testsRegisterLibraryName() {
			MockLibrary mock = new MockLibrary();
			User u = new UserImpl("Klaus");
			u.register(mock);
			String inputLibName = mock.getLibName();
			String outputLibName = u.getLibrary();
			String expectedLibName = inputLibName();
			assertEquals(outputLibName, expectedLibName);
		}
			
			
			
			
			
		
			
	}







