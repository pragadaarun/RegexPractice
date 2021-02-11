import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	Scanner sc = new Scanner(System.in);

	public void userFirstNameRegex()

	{
		System.out.println("Enter your First name:-");
		System.out.println("Instructions for \"First Name\" according to Regex rule :");
			System.out.println("\t[1] You have to enter First alphabet in CAPITAL letter ");
			System.out.println("\t[2] Other words then first can be in small or CAPITAL Letters");
			System.out.println("\t[3] You have to enter ATLEAST 3 alphabets");
		String firstName = sc.next();

		String regex = "[A-Z]{1}[a-zA-Z]{2,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		boolean checker = m.matches();

		if (checker == true) {
			System.out.println("Your Name " + firstName + "  is Valid ");
		} 
		else {
			System.out.println("Your entered Name is not valid");
		}
	}

	public void userLastNameRegex()

	{
		System.out.println("Enter your Last name:-");
		System.out.println(" Instructions for \"Last Name\" according to Regex rule :");
			System.out.println("\t [1] You have to enter First Alphabet in CAPITAL letter");
			System.out.println("\t [2] Other words then First may be in small or CAPITAL Letters");
			System.out.println("\t [3] You have enter to ATLEAST 3 alphabets");
		String lastName = sc.next();

		String regex = "[A-Z]{1}[a-zA-Z]{2,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		boolean checker = m.matches();

		if (checker == true) {
			System.out.println("Your Name  " + lastName + " is Valid");
		} 
		else {
			System.out.println("Your entered Name  " + lastName + " is not Valid");
		}
	}

	public void userEmailRegex()

	{
		System.out.println("Enter your Email:-");
		System.out.println(" Instructions for \"EMAIL\" according to Regex rule :");
			System.out.println("\t [1] You can enter small or CAPITAL Letters on your wish");
			System.out.println("\t [2] You can enter Numbers on your wish");
			System.out.println("\t [3] You can use Special Characters like UnderScore \"_\" and Dot \".\" "); 
			System.out.println("\t [4] You must add \"@\" symbol after precise name");
			System.out.println("\t [5] You must add mail company name after @ symbol");
			System.out.println("\t [6] You must add Domain name after Mail Company Name ");		
		String eMail = sc.next();

		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(eMail);
		boolean checker = m.matches();

		if (checker == true) {
			System.out.println("You Email " + eMail + "  is Valid ");
		} 
		else {
			System.out.println("Your entered Email " + eMail + "is not Valid");

		}
	}

	public void userPhoneNumberRegex()

	{
		System.out.println("Enter your PhoneNumber:-");
		System.out.println("Instructions for \"Phone Number\" according to Regex rule :");
			System.out.println("\t[1] You have to enter country code that is \"91\" ");
			System.out.println("\t[2] Without Country Code Your number should contain 10 numbers EXACTLY");
		
		String phoneNumber = sc.next();

		String regex = "[9][1][0-9]{10}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNumber);
		boolean checker = m.matches();

		if (checker == true) {
			System.out.println("Your Phone Number  " + phoneNumber + "  is Valid");
		} else {
			System.out.println("Your entered Phone Number " + phoneNumber + "is not Valid");


		}
	}
	//Password Validation
	public void userPasswordRegex()

	{
		System.out.println("Enter your Password:-");
		System.out.println(" Instructions for \"Phone Number \" according to Regex rule :");
			System.out.println("\t [1] You must minimum 8 Characters");
			System.out.println("\t [2] You must enter ATLEAST 1 CAPTIAL Letter");
			System.out.println("\t [3] You must enter ATLEAST 1 Small Letter");
			System.out.println("\t [4] You must use ATLEAST Special Characters like _ , @ $ & * .");
			System.out.println("\t [5] You must enter one Number  ");	
		String password = sc.next();

		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean checker = m.matches();

		if (checker == true) {
			System.out.println("Your Password " + password + "  is valid");
		} else {

			System.out.println("Your entered Password " + password + "is not Valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Regex reg = new Regex();
		reg.userFirstNameRegex();
		reg.userLastNameRegex();
		reg.userEmailRegex();
		reg.userPhoneNumberRegex();
		reg.userPasswordRegex();
	}

}