package main;
import java.util.Scanner;

class Courses {
	public String displayCourseDetails(String dept) {
			
			return "You have chosen "+dept+" department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
		}
}

class ECE extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		// write or edit your code here 
		String commonSubjects = super.displayCourseDetails("ECE");//call the parent function after using inheritence
		String subject1 = "Microprocessor"; //write the specific subjects name here
		String subject2 = "Linear Integrated Circuits"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;
		
	}
}
class Mechanical extends Courses{ //extend the parent class here 
	public String displayCourseDetails(String dept) {
		// write or edit your code here 
		String commonSubjects = super.displayCourseDetails("Mechanical");//call the parent function after using inheritence
		String subject1 = "Fluid Mechanics"; //write the specific subjects name here
		String subject2 = "Thermodynamics"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;	
	
	}

}
class CSE extends Courses { //extend the parent class here 
	public String displayCourseDetails(String dept) {
		
		// write or edit your code here 
		String commonSubjects = super.displayCourseDetails("CSE");//call the parent function after using inheritence
		String subject1 = "Network Theory"; //write the specific subjects name here
		String subject2 = "Operating Systems"; //write the specific subjects name here
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;		
	}
}

public class Question1 {
	public static void main(String[] args){
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		Question1 mn=new Question1();
		switch(choice) {
		case 1:
		{
			//this case is or ECE
			ECE obj = new ECE();
			System.out.println(obj.displayCourseDetails("ECE"));//call the function of the class that you initialized
			break;
		}
		case 2:
		{
			//this case is or Mechanical
			Mechanical obj = new Mechanical();
			System.out.println(obj.displayCourseDetails("Mechanical"));//call the function of the class that you initialized
			break;
		}
		case 3:
		{
			//this case is or CSE
			CSE obj = new CSE();
			System.out.println(obj.displayCourseDetails("CSE"));//call the function of the class that you initialized
			break;
		}
		default:
			System.out.println("Invalid input!");
		break;
		}
		in.close();
	}
}