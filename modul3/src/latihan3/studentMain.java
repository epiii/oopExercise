package latihan3;

public class StudentMain {
	public static void cetak(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		String[] grades={"B-","B","A"};
		int[] credits={2,1,3};
		Student std1=new Student(511600, "Ringgo", "Agus", "Rahman", "1990/05/22", "Economics", "Master", grades, credits, 2017);

		cetak("> ID\t: "+std1.getId());
		cetak("> Name\t: "+std1.getFullName());
		cetak("> Major\t: "+std1.getMajor());
		cetak("> Degree: "+std1.getDegree());
		cetak("> GPA\t: "+std1.getGpa());
		cetak("> Graduation(expectation): "+std1.getGradYear());

			std1.setMajor("Informatics");
		cetak("\n> Major(updated): "+std1.getMajor());
	}
}
