import java.util.Scanner;

public abstract class Human {
	
	abstract int getAge();

	abstract String getName();

	abstract String getLanguageSpoken();

	abstract void setAge(int x);

	abstract void setName();

	abstract void setLanguageSpoken();

	
    public  void printVillagerInfo()
	{
		StringBuilder humanInfo = new StringBuilder();
		
		humanInfo.append("Age:")
			.append(getAge())
			.append(", name:")
			.append(getName())
			.append(", language:")
			.append(getLanguageSpoken());
		
		System.out.println(humanInfo);
	}
}
