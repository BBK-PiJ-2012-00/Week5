/**
* A Book is an object which takes two Strings representing a book's author and title.
* The author and title can only be set once, after which point they cannot be changed.
*/

public interface Book {	
	/**
	* Return author.
	* @return the author as a String.
	*/
	String getAuthor();
	
	/**
	* Returns title.
	* @return the title as a String
	*/
	String getTitle();
	
}
	
	
 




















/**
Create a class for books. Books have authors and titles. The class should implement getters for both author name
and title, but these must be set at construction time and never be modified afterwards1.
*/

/**
1. Generate the tests for the functionality required for that stage. Check that the new tests fail while the old
ones pass. It is a good idea to define the interface of the class before writing the tests (but not the code of
the class yet!).
2. Generate the minimum code that passes all the new tests. If you wrote an interface, make the class implement
the interface (i.e. public class MyClass implements MyInterface, etc).
3. Refactor the code to make it clearer, if needed. Your first implementation may not be as clear as possible.
Think of the next programmer that will come after you: will they understand the code easily? Are variable
names clear and descriptive? Can you simplify those for loops and/or those if...else branches?
4. Document the code if it has not been done yet. Update the JavaDoc documentation (on a separate www folder)
using the command javadoc. Use your browser to check that it works and is easy to read.
*/