package latihan2;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
//instantiate
		Student mary = new Student("Mary Jones",14,46);
		Student john = new Student("John Stiner",60,137);
		Student ari = new Student("Ari Samala",31,69);

//initialize (before update)
		System.out.println("Before Update ...");

		System.out.println("nama :"+mary.getName());
		System.out.println("quality point :"+mary.getQualityPoints());
		System.out.println("GPA :"+mary.getGradePointAvg());
	System.out.println("----\n");
	
		System.out.println("nama :"+john.getName());
		System.out.println("quality point :"+john.getQualityPoints());
		System.out.println("GPA :"+john.getGradePointAvg());
	System.out.println("----\n");
	
		System.out.println("nama :"+ari.getName());
		System.out.println("quality point :"+ari.getQualityPoints());
		System.out.println("GPA :"+ari.getGradePointAvg());
	System.out.println("----\n");
//4 b

// after update
		System.out.println("After Update ...");
		mary.setCredits(10);
		john.setCredits(5);
		ari.setCredits(8);
// ----
		System.out.print(">>Mary ...\n");
		System.out.print("credits : "+mary.getCredits()+"\n");
		System.out.print("quality points : "+mary.getQualityPoints()+"\n");
		System.out.print("GPA : "+mary.getGradePointAvg()+"\n");
//		----
		System.out.print("john's credits : "+john.getCredits()+"\n");
		System.out.print("ari's credits : "+ari.getCredits()+"\n");
	}
}
