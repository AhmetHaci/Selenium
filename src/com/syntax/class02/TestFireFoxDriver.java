package com.syntax.class02;

public class TestFireFoxDriver implements SWebDriver {

	public TestFireFoxDriver() {
		System.out.println("Opening FireFox browser...");
	}
	@Override
	public void get(String url) {
		System.out.println("Launching the url :: + url");
		
	}

	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
