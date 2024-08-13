package com.adhii;

public class Person {
	int age;
	String name;
	
    Person(String name,int age){
    	this.age=age;
    	this.name=name;
    }
    void display() {
    	System.out.println("Name :"+name);
    	System.out.println("Age :"+age);
    }


	public static void main(String[] args) {
		Person obj1 = new Person("Adhi",21);
		obj1.display();
		Person obj2 = new Person("Arun",22);
		obj2.display();
	}

}
