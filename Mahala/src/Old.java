import java.util.Scanner;

public class Old extends Human {
	
	Scanner sc = new Scanner(System.in);
	int age;
	String languageSpoken;
	String name;
	
	@Override
	int getAge() {
		return age;
	}

	@Override
	String getName() {		
		return name;
	}

	@Override
	String getLanguageSpoken() {
		return languageSpoken;
	}

	@Override
	void setAge(int x) {
		age = x;
	}

	@Override
	void setName() {
		name = sc.nextLine();
	}

	@Override
	void setLanguageSpoken() {
		languageSpoken = sc.nextLine();
	}	
}

