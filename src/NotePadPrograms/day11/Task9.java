package NotePadPrograms.day11;

import java.util.Scanner;

public class Task9 {
	public static void task(String s) {
		s = s.toLowerCase();
		char first = s.charAt(0);

		String vowels = "aeiou";

		if (vowels.indexOf(first) != -1) {
			System.out.println("first character , " + first + " of String , " + s + "is vowel");
		} else {
			System.out.println("first character , " + first + " of String , " + s + " is not a vowel");
		}
	}
	public static boolean task2(String s) {
		s = s.toLowerCase();
		char first = s.charAt(0);
		String vowels = "aeiou";
		if (vowels.indexOf(first) != -1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		
		
		task(str);
		// System.out.println(task2(str));

	}

}
