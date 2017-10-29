package com.greenfox.foxclub;

import java.util.Arrays;
import java.util.List;

public class Trick {

	static List<String> names = (Arrays.asList("coffeMaker", "askingForSweets", "whateverElse"));

	String name;

	public List<String> getNames() {
		return names;
	}

	public String getName() {
		return name;
	}

	public Trick(String name) {
		this.name = name;
	}
}
