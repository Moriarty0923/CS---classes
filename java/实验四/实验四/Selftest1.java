package ʵ����;
interface Fight{
	void fight();
}

class FatFat implements Fight{
	public void fight() {
		System.out.println("FatFat ���˺�ʹ!");
	}
}

class Thinthin implements Fight{
	public void fight() {
		System.out.println("ThinThin ����һ�㶼��ʹ!!������");
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
