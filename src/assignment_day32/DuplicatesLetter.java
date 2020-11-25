package assignment_day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type whatever you like.");
		String types = input.nextLine();
		char[] chars = types.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : chars) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}
		System.out.print("Duplicate Characrters are:");
		for (char c : map.keySet()) {
			if (map.get(c) > 1) {
				System.out.print(c + " ");
			}
		}
	}

}
