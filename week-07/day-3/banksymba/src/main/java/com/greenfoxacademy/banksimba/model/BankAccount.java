package com.greenfoxacademy.banksimba.model;

public class BankAccount {
	String name;
	double balance;
	String animalType;

	public BankAccount(String name, int balance, String animalType) {
		this.name = name;
		this.balance = balance;
		this.animalType = animalType;
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
}
