package Logical_Pgms;

public class String_count_number_Of_while_spaces_In_string {

	public static void main(String[] args) {
		int count = 0;
		String str = "ab   c d";

//System.out.println(str.length()-str.replace(" ", "").length());
		for (int i = 0; i <= str.length() - 1; i++) {
			char str1 = str.charAt(i);
			if (str1 == ' ') {
				count++;
			}
		}

		System.out.println("no of spaces in given string: " + count);

	}

}
