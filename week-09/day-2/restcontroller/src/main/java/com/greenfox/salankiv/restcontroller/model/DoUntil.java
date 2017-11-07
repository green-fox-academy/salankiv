package com.greenfox.salankiv.restcontroller.model;

import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.ArrayList;

public class DoUntil {
	int until;

	public DoUntil() {
	}

	public DoUntil(int until) {
		this.until = until;
	}

	public int getUntil() {
		return until;
	}

	public void setUntil(int until) {
		this.until = until;
	}

	public ResultNumber getResult(String action) {
		if (action.equals("sum")) {
			return new ResultNumber(this.getSum());
		} else if (action.equals("factor")) {
			return new ResultNumber(this.getFactor());
		}	else throw new HttpMessageNotReadableException("Please provide a number!");
	}

	public ArrayList<Integer> getSum() {
		int temp = 0;
		for (int i = 1; i <= this.getUntil(); i++) {
			temp += i;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(temp);
		return result;
	}

	public ArrayList<Integer> getFactor() {
		int temp = 1;
		for (int i = 1; i <= this.getUntil(); i++) {
			temp *= i;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(temp);
		return result;
	}
}
