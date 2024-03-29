/**
* Users have a name and a library-ID (an int), both of which must be unique in a library. The name is set
* at construction time, but the library-ID is not.  The class implements methods to get the name of the person
* and their ID, and to set the latter.
*/


public interface User {

	/**
	* Sets a unique user ID.
	* @param id is the ID to assign to a username.
	*/
	void setID(int id);
	
	/**
	* Gets the username.
	* @return username is returned as a String.
	*/
	String getUsername();
	
	/**
	* Gets user ID.
	* @return ID is returned as an int.
	*/
	int getID();
	
	/**
	* Allows users to register with a library.
	* This is the way to obtain a User-ID -- the library assigns ID to a user.
	* Obtains the ID from the library, and sets it for the user by calling setID().
	* @param Library selects the library that the user will be associated with.
	*/
	void register(Library library);
	
	/**
	* Gets the library associated with a user.
	* @return Library is returned as a String.
	*/
	String getLibrary();
	
}



















/**
Extend the class you have just created to allow users to register with a library. You will need two methods
register(Library) and getLibrary(). The former method is the way to obtain the user-ID.
Important. As you do not have a Library class yet, you will need a fake Library object to test your method
register(Library). This is called a mock object, and it is a common practice when writing testing code because
it allows the programmer to test one class at a time �instead of testing several classes at the same time, which is
more complex and thus error-prone�. The mock library object does not need to do anything apart from providing
a name (so that your class can return it when you call getLibrary() and an ID when you call getID(). Because
it is a mock object and not the real one, it can return trivial values (i.e. the name can be always �Library name�
and the ID can be always 13).
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