package lambda_function;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		Person p = new Person("Person One", 20);
		people.add(p);
		p = new Person("Person Two", 30);
		people.add(p);
		p = new Person("Person Three", 40);
		people.add(p);
		

		System.out.println("People older than 25 years are:");
		display(people, x -> x.getAge() > 25);
		
		System.out.println("\nPeople older than 30 with names starting with the letter 'P':");
		display(people, x -> x.getAge() > 30 && x.getName().startsWith("P"));
		
	}
	
	static void display(ArrayList<Person> people, Condition<Person> condition) {
		for(Person p: people) {
			if(condition.test(p)) System.out.println(p);
		}
	}

}
