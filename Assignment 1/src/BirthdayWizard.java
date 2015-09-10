import java.util.Scanner;
public class BirthdayWizard {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your year of birth:");
		int year=keyboard.nextInt();
		System.out.print("Enter the age you want to find the year of:");
		int age=keyboard.nextInt();
		System.out.println("when you are "+age+" it will be the year "+(year+age)+".");
	}
}
