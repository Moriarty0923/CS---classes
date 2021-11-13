package สตั้หฤ;
interface Listener{
	void action();
}

class test2 implements Listener{
	public void action() {System.out.println("sit down");}
}

public class testinfer implements Listener {
	public void add(Listener a) {a.action();}
	public void action() {System.out.println("stand up");}
	public static void main(String[] args) {
		testinfer x= new testinfer();
		x.add(x);
		x.add(new test2());
	}
}