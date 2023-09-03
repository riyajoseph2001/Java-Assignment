package com.faith.app;

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;
import com.faith.propel.java.camp4.Myanimals;

public class AnimalsApp {

	public static void main(String[] args) {
		Myanimals obj = new Myanimals();
		obj.setBodyTemp(30);
		System.out.println("Body Temperature :"+obj.getBodyTemp());
		Cat c = new Cat();
		c.saySomething();
		Dog d = new  Dog();
		d.saySomething();

	}

}
