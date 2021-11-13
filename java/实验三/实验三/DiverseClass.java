package 实验三;
import java.util.Calendar;
class Employee{
	String name;
	int age;
	String sdept;
	Calendar indate;
	int basicSalary;
	public Employee() {
		this.name="";
		this.age=0;
		this.sdept="";
		indate=Calendar.getInstance();
		this.indate.set(2000,1-1,1);
		this.basicSalary=0;
		
	}
	public Employee(String name,int age,String sdept,Calendar indate,int basicSalary) {
		this.name=name;
		this.age=age;
		this.sdept=sdept;
		indate=Calendar.getInstance();
		this.indate=indate;
		this.basicSalary=basicSalary;
	}
	public int comSalary() {
		int salary,dyear;
		Calendar cnow=Calendar.getInstance();
		dyear=cnow.get(Calendar.YEAR)-indate.get(Calendar.YEAR);
		salary = basicSalary+dyear*20;
		System.out.println("Runing case employee");
		return salary;
	}
}

class Manager extends Employee{
	int bonus;
	public Manager() {
		bonus=0;
	}
	public Manager(Employee E,int bonus) {
		this.name=E.name;
		this.age=E.age;
		this.sdept=E.sdept;
		this.indate=Calendar.getInstance();
		this.indate=E.indate;
		this.basicSalary=E.basicSalary;
		this.bonus=bonus;
	}
	public Manager(String name,int age,String sdept,Calendar indate,int basicSalary,int bonus){ 
		this.name=name;
		this.age=age;
		this.sdept=sdept;
		this.indate=Calendar.getInstance();
		this.indate=indate;
		this.basicSalary=basicSalary;
		this.bonus=bonus;
	}
	public int comSalary() {
	int salary,dyear;
	Calendar cnow=Calendar.getInstance();
	dyear=cnow.get(Calendar.YEAR)-indate.get(Calendar.YEAR);
	salary = basicSalary+dyear*20 + bonus;
	System.out.println("Runing case manager");
	return salary;
	}
}
	


class Contractor extends Employee{
	Calendar offdate;
	public Contractor() {
		offdate=Calendar.getInstance();
		offdate.set(2000, 1-1);
	}
	public Contractor(Employee E,Calendar offdate) {
		this.name=E.name;
		this.age=E.age;
		this.sdept=E.sdept;
		this.indate=Calendar.getInstance();
		this.indate=E.indate;
		this.basicSalary=E.basicSalary;
		this.offdate=offdate;
	}
	public Contractor(String name,int age,String sdept,Calendar indate,int basicSalary,Calendar offdate){ 
		this.name=name;
		this.age=age;
		this.sdept=sdept;
		this.indate=Calendar.getInstance();
		this.indate=indate;
		this.basicSalary=basicSalary;
		this.offdate=offdate;
	}
	public int comSalary() {
	int salary,dyear;
	dyear=this.indate.get(Calendar.YEAR)-this.offdate.get(Calendar.YEAR);
	salary = basicSalary+dyear*15 ;
	System.out.println("Runing case contractor");
	return salary;
	}
}	

	
public class DiverseClass {
		public int salary(Employee e) {
			return e.comSalary();
		}
 
public static void main(String[] args) {
	DiverseClass diverse = new DiverseClass();
	Calendar c1 = Calendar.getInstance();
	c1.set(2010, 10 - 1,1);
	Calendar c2 = Calendar.getInstance();
	c2.set(2020, 10 - 1,1);
	Employee a1 = new Employee("张三",18,"xx部",c1,10000);
	Manager a2 = new Manager("李四",19,"xx部",c1,10000,20000);
	Contractor a3 = new Contractor("小明",20,"xx部",c1,10000,c2);
		System.out.println(diverse.salary(a1));
		System.out.println(diverse.salary(a2));
		System.out.println(diverse.salary(a3));

	}
}
