package 实验四;

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
		//访问外部类中的radius变量
		System.out.println(Circle.this.radius);
		}
	}
	
	
	public static void main(String[] args) {
		//第一种方式 通过outter对象来创建内部类
			Circle c1 = new Circle(1.0);
			Circle.Draw d1=c1.new Draw();
			d1.drawSahpe();
		//第二种方式 
			Circle c2 = new Circle(2.0);
			Circle.Draw d2= c2.getInstance();
			d2.drawSahpe();
	}
}
