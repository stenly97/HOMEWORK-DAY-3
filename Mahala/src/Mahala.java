import java.util.Scanner;

public class Mahala {

	public static void main(String[] args) {
		int occupants;
		Scanner sc=new Scanner(System.in);
		System.out.print("number of occupants: ");
		occupants=sc.nextInt();
		
		int age;
		Human[] ppl;
		ppl=new Human[10];
		int averageAge=0;
		for(int i=0;i<occupants;i++)
		{
			System.out.print("enter age: ");
			age=sc.nextInt();
			System.out.println();
			if(age<6) 
			{
				ppl[i]=new Baby();
				ppl[i].setAge(age);
				ppl[i].setLanguageSpoken();
				System.out.print("enter name: ");
				ppl[i].setName();
				System.out.println();
			}
			else if(age>59) {
				ppl[i]=new Old();
				ppl[i].setAge(age);
				System.out.print("enter language: ");
				ppl[i].setLanguageSpoken();
				System.out.println();
				System.out.print("enter name: ");
				ppl[i].setName();
				System.out.println();

			}
			else 
			{
				ppl[i]=new Teen();
				ppl[i].setAge(age);
				System.out.print("enter language: ");
				ppl[i].setLanguageSpoken();
				System.out.println();
				System.out.print("enter name: ");
				ppl[i].setName();
				System.out.println();
			}
			
			averageAge+=age;
		}
		
		averageAge/=occupants;
		System.out.print("Average age of people in this area: "+ averageAge);
		

	}

}
