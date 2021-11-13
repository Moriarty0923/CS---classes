package สตั้ถþ;
import java.sql.Date;
public class Person {
	private Date birthDate;
	private static Date startDate,endDate;
	static{
		startDate = Date.valueOf("1946");
		endDate = Date.valueOf("1964");
	}	
	public Person(Date birthDate) {
		this.birthDate = birthDate;
	}	
	boolean isBornBoomer() {
		return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
