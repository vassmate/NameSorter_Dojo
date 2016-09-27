package dojo_09_27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class NameSorter {

	private final File inputFile = new File("names.txt");
	private BufferedReader bReader;
	private Set<String> sortedNames = new TreeSet<>();

	public NameSorter() {
		makeNewBuffReader();
		readNamesFromFile();
	}

	public int getCountOfIndividualNames() {
		return getSortedNames().size();
	}

	public Set<String> getSortedNames() {
		return this.sortedNames;
	}

	private void makeNewBuffReader() {
		try {
			bReader = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private BufferedReader getBuffReader() {
		return this.bReader;
	}

	private String makeNameFromLine(String[] line) {
		String name = "";
		int i = 0;
		while (!line[i].equals(",")) {
			name += line[i];
			i++;
		}
		return name;
	}

	private void readNamesFromFile() {
		String[] line;
		String name;

		try {
			while (getBuffReader().readLine() != null) {
				line = getBuffReader().readLine().split("");
				name = makeNameFromLine(line);
				sortedNames.add(name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
