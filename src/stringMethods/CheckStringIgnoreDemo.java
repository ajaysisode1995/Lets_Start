package stringMethods;

public class CheckStringIgnoreDemo {
	public static void main(String[] args) {
		String firstString = "My Name Is Gaurav!";
		 
        String secondString = "my name is gaurav!";
        
        boolean checkString = checkString(firstString,secondString);
        System.out.println(checkString);
	}

	private static boolean checkString(String firstString, String secondString) {
		if (firstString.equalsIgnoreCase(secondString)) {
			return true;
		}
		return false;
		
		
	}

	
}
