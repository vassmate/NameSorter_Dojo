package dojo_09_27;

import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		int nameCount = 0;
		NameSorter ns = new NameSorter();
		nameCount += ns.getCountOfIndividualNames();
		Set<String> sNames = ns.getSortedNames();

		System.out.println("Number of individual names: " + nameCount);
		System.out.println();
		System.out.println("Sorted names from file: ");
		for (String name : sNames) {
			System.out.println(name);
		}
	}
}
