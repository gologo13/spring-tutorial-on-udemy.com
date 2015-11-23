package com.gologo13.spring.test;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.print("Write to file: " + text);
	}
	

}
