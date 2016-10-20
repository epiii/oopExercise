/**
 * 
 */
package latihan2;

/**
 * @author epi.corp
 *
 */
public class Student {
	private String name;
	private int credits;
	private float gradePointAvg;
	private float qualityPoints;
	Student(){
		name="";  
		gradePointAvg =0;
		qualityPoints  =0;
	}
	Student(String name, int credits, float qualityPoints){
		this.qualityPoints=qualityPoints;
		this.name=name;
		this.credits=credits;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setCredits(int name){
		this.credits=credits;
	}
	public float getGradePointAvg(){
		return qualityPoints/credits;
	}
	public float getQualityPoints(){
		return qualityPoints;
	}
	public String getName(){
		return name;
	}
	public int getCredits(){
		return credits;
	}
}