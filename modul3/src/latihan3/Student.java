package latihan3;
public class Student extends Person {
	private int id;
	private String major;
	private int gradYear;
	private String degree;
	private String[] grades; // array
	private int[] credits; // array
	
	public Student(	int id,
					String firstName,
					String middleName, 
					String lastName,
					String dateOfBirth,
					String major,
					String degree,
					String[] grades,
					int[] credits,
					int gradYear) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.grades=grades;
		this.credits=credits;
		this.id=id;
		this.gradYear=gradYear;
		this.major=major;
		this.degree=degree;
	}
	
//	---
	protected int getId() {
		return id;
	}
	protected int getGradYear() {
		return gradYear;
	}
	protected String getMajor() {
		return major;
	}
	protected String getDegree() {
		return degree;
	}

	protected void setMajor(String major) {
		this.major = major;
	}
//----
	private double getGpe(String grd){
		double gpe;
		if(grd=="F") gpe=0;
		else if(grd=="D") gpe=1;
		else if(grd=="C") gpe=2;
		else if(grd=="C+") gpe=2.33;
		else if(grd=="B-") gpe=2.67;
		else if(grd=="B") gpe=3;
		else if(grd=="B+") gpe=3.33;
		else if(grd=="A-") gpe=3.67;
		else gpe=4;
		return gpe;
	}
	
	protected double getGpa() {
		double gpax,totGrade=0,totCredit=0;
		for(int i=0; i<grades.length;i++){
			totGrade+=getGpe(grades[i])*credits[i];
			totCredit+=credits[i];
		}gpax=(grades.length==0?0:(totGrade/totCredit));
		return gpax;
	}
}
