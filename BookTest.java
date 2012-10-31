import org.junit.*;
import static org.junit.Assert.*;

	public class BookTest {
		@Test
		public void testsNormalAuthor() {
			String inputTitle = "Only Forward";
			String inputAuthor = "Michael Marshall Smith";
			Book b = new BookImpl(inputAuthor, inputTitle); //Testing the class THROUGH the interface, hence Book (Interface) b = new BookImpl (class).
			String outputTitle = b.getTitle();
			String expectedTitle = "Only Forward";
			String outputAuthor = b.getAuthor();
			String expectedAuthor = "Michael Marshall Smith";
			assertEquals(outputTitle, expectedTitle);
			assertEquals(outputAuthor, expectedAuthor);
			}
			
	}



