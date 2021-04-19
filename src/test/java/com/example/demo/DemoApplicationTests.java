package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void shouldShowStreams() {
		List<Person> people = List.of(
				new Person("Ilya Klimov", 25, Gender.MALE),
				new Person("Ivan Petrov", 48, Gender.MALE),
				new Person("Maria Ivanova", 17, Gender.FEMALE)
		);

		List<Person> males = new ArrayList<>();

		for (Person person : people) {
			if (person.getGender().equals(Gender.MALE)) {
				males.add(person);
			}
		}

		var coolMales = people.stream()
				.filter(person -> person.getAge() > 17)
				.collect(Collectors.toList());

		List<Person> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());

		boolean result = people.stream()
				.allMatch(person -> person.getAge() > 15);

		Map<Gender, List<Person>> groupedPeople = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));

		//groupedPeople.forEach((gender, peopleList) -> {
			//System.out.println(gender);
			// peopleList.forEach(System.out::println);
		//});

		Optional<Integer> oldestWoman = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.max(Comparator.comparing(Person::getAge))
				.map(Person::getAge);

		oldestWoman.ifPresent(System.out::println);
	}

}
