
public class IntroToStringMethods {

	public static void main(String[] args) {
		String str1 = "Hudson is an unbelievable hockey player.";
		String str2 = "Onyx loves vietnamese food.";
		String str3 = "Henry loves George the cat";
		String str4 = "Yay";
		String str5 = "Yay";
		
		//indexOf(String obj) returns the smallest index of the occurrence
		int position = str1.indexOf("hockey");
		System.out.println(position);
		
		//obj.toUpperCase() changes all characters to uppercase
		String s1 = str3.toUpperCase();
		System.out.println(s1);
		
		//obj1.equals(obj2) returns true if the sequence of characters is the same
		boolean testeq1 = str1.equals(str2);
		System.out.println(testeq1);
		boolean testeq2 = str4.equals(str5);
		System.out.println(testeq2);

		
		//obj.length returns the number of unicode characters in a string
		int len = str2.length();
		System.out.println(len);
		
		//obj.substring(int x) returns string beginning at index and ending with obj.length()-1
		String sub1 = str3.substring(10);
		System.out.println(sub1);
		
		//obj.substring(int x, int y) returns string beginning at index x and ending at index y-1
		String sub2 = str3.substring(5,7);
		System.out.println(sub2);
		
		String sub3 = sub1.substring(len/2);
		System.out.println(sub3);
		
		String str6 = "Onyx";
		String str7 = "Henry";
		String str8 = "Hudson";
		
		//obj1.compareTo(obj2) compares two string lexicographically
		int num1 = str6.compareTo(str7);
		System.out.println(num1);
		
		int num2 = str7.compareTo(str6);
		System.out.println(num2);
		
		
		
	}

}
