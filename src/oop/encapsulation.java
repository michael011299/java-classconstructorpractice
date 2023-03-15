package oop;

public class encapsulation {

	public static void main(String[] args) {
		Person john = new Person("John", 25, "Software developer");
		Person steve = new Person("steve", 45, "nature man");
		System.out
				.println(john.getName() + " is " + john.getAge() + " years old and works as a " + john.getOccupation());
		System.out.println(
				steve.getName() + " is " + steve.getAge() + " years old and works as a " + steve.getOccupation());
	}

}
