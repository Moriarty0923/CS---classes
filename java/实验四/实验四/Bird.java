package ʵ����;
class Test{
	public void test(Bird bird) {
		System.out.println(bird.getName()+"�ܹ���"+bird.fly()+"��");
	}
}
public abstract class Bird {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public abstract int fly();	
	public static void main(String[] args) {
		Test test = new Test();
		//�����ಿ��
		test.test(new Bird(){
			public int fly() {
				return 10000;
			}
			public String getName() {
				return "����";
			}
		});
	}
}

