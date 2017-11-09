package com.greenfox.salankiv.restcontroller.loghandler;

import java.util.List;

public class History {
	List<Log> entries;
	int entry_count;

	public History(List<Log> entries) {
		this.entries = entries;
		this.entry_count = entries.size();
	}

	public History() {
	}

	public int getEntry_count() {
		return entry_count;
	}

	public void setEntry_count(int entry_count) {
		this.entry_count = entry_count;
	}

	public List<Log> getEntries() {
		return entries;
	}

	public void setEntries(List<Log> entries) {
		this.entries = entries;
	}
}
