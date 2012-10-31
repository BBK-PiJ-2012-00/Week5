public class PersonF { 
	private final String NAME; //NAME rather than 'name', by conventions

	public PersonF(String name) { //constructor allowed so that value can be set once - field is uninitialised to start with.
	this.NAME = name;
	}
	
	public String getName() {
	 return this.NAME;
	}
	
	/**
	* You cannot change a final field, hence a setter method for it is disallowed
	public void setName(String name) { 
		this.name = name;
	}
	*/
	
	public static void main(String[] args) {
	
	PersonF person = new PersonF("Rufus");
	System.out.println(person.getName());
	
	}
}