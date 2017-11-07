package com.greenfox.salankiv.restcontroller.model;

public class AppendA {
	String appended;

	public AppendA(String whatToAppend) {
		this.appended = whatToAppend + "a";
	}

	public String getAppended() {
		return appended;
	}

	public void setAppended(String appended) {
		this.appended = appended;
	}
}
