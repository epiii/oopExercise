/**
 * 
 */
package latihan3;

import java.util.Date;
/**
 * @author epi.corp
 *
 */
public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;

	protected Person(String firstName, String middleName,String lastName, String dateOfBirth ){
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	
	protected String getFirstName() {
		return firstName;
	}

	protected String getMiddleName() {
		return middleName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected String getDateOfBirth() {
		return dateOfBirth;
	}
	
	protected String getFullName() {
		return firstName+" "+middleName+" "+lastName;
	}
}