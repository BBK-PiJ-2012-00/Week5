public class MockLibrary {
	private String libName = "Library name";
	private int assignedID = 13;
	
	public String getLibName() {
		return libName;
	}
	
	public int getAssignedID() {
		return assignedID;
	}
	
}
		













/**
As you do not have a Library class yet, you will need a fake Library object to test your method
register(Library). This is called a mock object, and it is a common practice when writing testing code because
it allows the programmer to test one class at a time —instead of testing several classes at the same time, which is
more complex and thus error-prone—. The mock library object does not need to do anything apart from providing
a name (so that your class can return it when you call getLibrary() and an ID when you call getID(). Because
it is a mock object and not the real one, it can return trivial values (i.e. the name can be always “Library name”
and the ID can be always 13).
*/