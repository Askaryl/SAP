/**
 * 
 */

/**
 * @author henrilanglois-droal
 *
 */
public class Etudiant {

	//variables definition
	String firstname;
	String firstnamebis = "Henri_bis";
	String lastname;
	int age;
	String country;
	String number = "3";
	int numberD;
	
	public Etudiant() {
	}

	public void savedUser(String firstname, String lastname, int age, String country) {
		System.out.println("Hello this is my card ID");
		System.out.println("FirstName : "+firstname);
		System.out.println("FirstNameBis : "+firstnamebis);
		System.out.println("LastName : "+lastname);
		System.out.println("Country : "+country);
		System.out.println("Age : "+age);
	}
	
	public int age10(int age) {
		int myNewAge= age*10;
		System.out.println("Age*10 = " +myNewAge);
		return myNewAge;
		}
	
	public int StringToInt(String number) {
		int numberD = Integer.parseInt(number);
		System.out.println("Nombre*2 = "+numberD*2);
		return numberD;
		}
}
	