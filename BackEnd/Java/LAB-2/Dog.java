package com.adhii;

public class Dog {
	String name;
	String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void setName(String name) {
		this.name=name;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Breed :"+breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initial Values...");
		Dog dog1 = new Dog("Rockiee","Pug");
		dog1.display();
		Dog dog2 = new Dog("Charlie","Labrador");
		dog2.display();
		System.out.println("Updated Values...");
		
		dog1.setName("Leo");
		dog1.setBreed("Pitbull");
		
		dog2.setName("jangoo");
		dog2.setBreed("German Shephard");
		
		dog1.display();
		dog2.display();

	}

}
