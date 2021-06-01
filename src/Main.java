
public class Main {

	public static void main(String[] args) {
		
		String str = new String("avocados");
		String str2 = new String("avocados");

		// == Does not compare the values of Strings
		System.out.println("avocados == avocados " + (str == str2));

		// The equals method compares String values
		System.out.println("\"avocados\".equals(\"avocados\") " + (str.equals(str2)));

		// We can use equals in an if-statements
		if (str.equals(str2)) {
			System.out.println("The strings are equal");
		}

		// The compareTo method can tell us if a string is greater,
		// less-than, or equal to another alphabetically (A < Z)
		int result = str.compareTo("cat");
		// compareTo returns:
		// > 0 if str > "cat" (later in the alphabet)
		// < 0 if str < "cat" (earlier in the alphabet)
		// == 0 if str == "cat" (exact same string)
		
		//compareTo can be used in if-statements
		if(str.compareTo(str2) > 0) {
			System.out.println(str + " is greater than " + str2);
		}
		
		//e=101 a=97
		if("fern".compareTo("farm") > 0 && "Cat".equals("cat")) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
