package utilities;

import com.github.javafaker.Faker;


public class DataGenerator {
    
	public static String getEmail() {
		Faker faker = new Faker();
		String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		return email;
	}

	public static String getPassword() {
		Faker faker = new Faker();
		String password = faker.funnyName().name();
		return password;
	}

	public static String getFirstName() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		return firstName;
	}

	public static String getTitle() {
		Faker faker = new Faker();
		String title = faker.name().title();
		return title;
	}

	public static String getLastName() {
		Faker faker = new Faker();
		String lastName = faker.name().lastName();
		return lastName;
	}

	public static String getGender() {
		Faker faker = new Faker();
		String gender = faker.name().bloodGroup();
		return gender;
	}



}