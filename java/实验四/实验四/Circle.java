package ʵ����;

class Circle {
	double radius = 0;
	public Circle(double radius) {
		this.radius=radius;
	}
	public Draw getInstance() {
		Draw in= new Draw();
		return in;
	}
	
	class Draw{
		public void drawSahpe() {
		System.out.println("drawshape");	
		//�����ⲿ���е�radius����
		System.out.println(Circle.this.radius);
		}
	}
	
	
	public static void main(String[] args) {
		//��һ�ַ�ʽ ͨ��outter�����������ڲ���
			Circle c1 = new Circle(1.0);
			Circle.Draw d1=c1.new Draw();
			d1.drawSahpe();
		//�ڶ��ַ�ʽ 
			Circle c2 = new Circle(2.0);
			Circle.Draw d2= c2.getInstance();
			d2.drawSahpe();
	}
}
