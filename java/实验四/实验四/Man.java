package สตั้หฤ;
class People {
	public People() {
		
	}
}

public class Man {
	public Man() {
		
	}
	public People getWoman() {
		class Woman extends People{
			int age=0;
		}
		System.out.println("Running getWoman");
		return new Woman();
	}
	public static void main(String[] args) {
		Man m=new Man();
		m.getWoman();
	}
}
