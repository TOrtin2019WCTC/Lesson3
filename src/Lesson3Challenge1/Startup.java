package Lesson3Challenge1;

import java.util.ArrayList;
import java.util.List;

public class Startup {

    public static void main(String[] args) {
		List<Person> people = new ArrayList();

		people.add(new Person("Tim", "Ortin", 34));
		people.add(new Person("Jasmine", "Ortin", 30));
		people.add(new Person("Luke", "Ortin", 3));


		for (Person p : people) {
			System.out.println(p.getFirstName() + " " + p.getLastName() + " is " + p.getAge() + " years old.");
		}


	}
	}
