package com.faith.propel.java.camp4;

public class Myanimals extends Animals implements Imammals{
	
	private int bodyTemp;
	
	

	public int getBodyTemp() {
		return bodyTemp;
	}

	public void setBodyTemp(int bodyTemp) {
		this.bodyTemp = bodyTemp;
	}

	@Override
	public int getBodyTemp(String temp) {
		
		return Integer.parseInt(temp);
	}

	@Override
	public void saySomething() {
		
	}

}
