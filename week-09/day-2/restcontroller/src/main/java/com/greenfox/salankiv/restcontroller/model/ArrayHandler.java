package com.greenfox.salankiv.restcontroller.model;

import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.ArrayList;

public class ArrayHandler {
	String what;
	ArrayList<Integer> numbers;

	public ArrayHandler(String what, ArrayList<Integer> numbers) {
		this.what = what;
		this.numbers = numbers;
	}

	public ArrayHandler() {
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public ResultNumber getResult() {
		if (this.getWhat().equals("sum")) {
			return new ResultNumber(this.getSum(this.getNumbers()));
		} else if (this.getWhat().equals("multiply")) {
			return new ResultNumber(this.getMultiply(this.getNumbers()));
		} else if (this.getWhat().equals("double")) {
			return new ResultNumber(this.getDouble(this.getNumbers()));
		} else throw new HttpMessageNotReadableException("Please provide what to do with the numbers!");
	}

	public ArrayList<Integer> getSum(ArrayList<Integer> numbers) {
		int temp = 0;
		for (int i = 0; i < numbers.size(); i++) {
			temp += numbers.get(i);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(temp);
		return result;
	}

	public ArrayList<Integer> getMultiply(ArrayList<Integer> numbers) {
		int temp = 1;
		for (int i = 0; i < numbers.size(); i++) {
			temp *= numbers.get(i);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(temp);
		return result;
	}

	public ArrayList<Integer> getDouble(ArrayList<Integer> numbers) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			result.add(numbers.get(i) * 2);
		}
		return result;
	}
}
