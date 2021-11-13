package 实验四;
interface Fight{
	void fight();
}

class FatFat implements Fight{
	public void fight() {
		System.out.println("FatFat 打人很痛!");
	}
}

class Thinthin implements Fight{
	public void fight() {
		System.out.println("ThinThin 打人一点都不痛!!哈哈。");
	}
}

public class Selftest1 {
	void f(Fight i) {
		i.fight();
	}
	public static void main(String[] args) {
			Selftest1 test= new Selftest1();
			FatFat f=new FatFat();
			Thinthin t=new Thinthin();
			test.f(f);
			test.f(t);
	}

}
