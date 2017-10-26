package com.greenfox.color;

public class Color implements MyColor {
	String color;

	@Override
	public void printColor() {
		System.out.println(this.color);
	}
}
