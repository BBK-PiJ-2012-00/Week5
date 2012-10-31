public class Personx {			
		
	
	public String getInitials(String fullName) {
		fullName = removeDuplicateSpaces(fullName);					
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
	
	public String removeDuplicateSpaces(String fullName) { //what about three or more spaces between words?
		String fullNameParsed = "";
		int i;
		for (i = 0; i < fullName.length(); i++) {
			char c = fullName.charAt(i);
			if (i < fullName.length() -1) {
				char d = fullName.charAt(i + 1); 
				if ((c == ' ') && (d == ' ')) {
					fullNameParsed = fullNameParsed + c;
					i++;
				}
				else {
					fullNameParsed = fullNameParsed + c;
				}
			}
			else {
				fullNameParsed = fullNameParsed + c;
			}
		}
		return fullNameParsed;
	}
	 
	public String removeDuplicateSpaces(String fullName) {
		String fullNameParsed = "";
		int i;
		for (i = 0; i < fullName.length(); i++) {
			char c = fullName.charAt(i);
			if (i < fullName.length() -1) {
				char d = fullName.charAt(i + 1); 
				if ((c == ' ') && (d == ' ')) {
					i++;
				}
			}
			fullNameParsed = fullNameParsed + c;
		}
		return fullNameParsed;
	}
	 
}

