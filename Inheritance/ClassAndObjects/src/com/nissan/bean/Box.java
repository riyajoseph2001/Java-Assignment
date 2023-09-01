package com.nissan.bean;
//Question 1
public class Box {
	private double width = 0.0;
	private double height = 0.0;
	private double depth = 0.0;
	public double volumn=0.0;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double volumn() {
		this.volumn = this.width*this.height*this.depth;
		return volumn;
	}
	
	

}
