public class UserImpl implements User {

	private String username;
	private int id;
	private String assocLibrary;

	public UserImpl(String username) {
		this.username = username;		
	}
	
	public String getUsername() {
		return username;	
	}	
	
	public void setID(int id) {
		this.id = id;	
	}
	
	public int getID() {
		return id;	
	}
	
	public void register(Library library) {
		id = library.getAssignedID();
		setID(id);
		assocLibrary = library.getLibName();		
	}
	
	public String getLibrary() {
		return assocLibrary;
	}
		
	
	
		

}


/**
* 1. Interface
* 2. Write test
* 3. Class
* 4. Run test using implementation of class through interface
*/

