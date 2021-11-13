package สตั้ถþ;

public class Point{
	int x,y;
	public String toString()
	{
		return x+","+y;	
	}
	public Point(int x1,int y1)
	{
		this.x=x1;
		this.y=y1;
	}
	public Point()
	{
		this(10,10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point();
		System.out.println(a);
		Point b=a;
		a.x=5;
		System.out.println(b);
		b=new Point(8,3);
		b=null;
		System.out.println(b);
		Point c[]=new Point[8];
		c[0]=a;
		c[1]=b;
		c[6]=new Point(4,6);
		c[7]=new Point();
		for(int k=0;k<c.length;k++)
			System.out.println(c[k]);
	}
}
