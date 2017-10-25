package com.greenfoxacademy.banksimba.model;

public class BankAccount {
	String name;
	double balance;
	String animalType;
	boolean king;

	public BankAccount(String name, int balance, String animalType, boolean king) {
		this.name = name;
		this.balance = balance;
		this.animalType = animalType;
		this.king = king;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getAnimalType() {
		return animalType;
	}

	public boolean isKing() {
		return king;
	}
}
