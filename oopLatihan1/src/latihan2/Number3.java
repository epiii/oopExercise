/**
 * 
 */
package latihan2;

/**
 * @author epi.corp
 *
 */
public class Number3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		default constructor 
		Animal aml = new Animal();
		System.out.println("Animal#1 has a speed of "+aml.getSpeed()+" mph");

		//		parameter within constructor 
		Animal aml2 = new Animal(40,25,5);
		System.out.println("Animal#2 has a speed of "+aml2.getSpeed()+" mph");
	}
}
