import java.util.Scanner;
class URLify
{
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");	
	String raw_string = sc.nextLine();
	int trueLenght = raw_string.length();
	System.out.println(getURLValue(raw_string, trueLenght));
}


public static String getURLValue(String str, int trueLength) {
	StringBuilder result = new StringBuilder(); // String builder is a mutable sequence of characters, it is used when we want to modify a string in java.
	for(int i =0; i < trueLength; i++) {
		char value = str.charAt(i);
		if(Character.isAlphabetic(value)) { //isAlphabetic() returns true if the char is an alphabet, else false
			result.append(value);
		}
		else
			result.append("%20");
	}				
	return result.toString();
}
}

