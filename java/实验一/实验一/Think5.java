package 实验一;
public class Think5 {
	public static void main(String[] args) {
		System.out.println("x=0.2~1.0之间步长为0.2的所有ex的值分别为:");
		for(double x=0.2;x<=1.0;x+=0.2) {			//计算x=0.2~1.0 步长为0.2的ex值
			double res = Ex.ex(x);
			System.out.println(" x= "+String.format("%.1f",x)+" 时E^x= "+String.format("%.5f", res));
		}											//计算精度为0.00001
	}
}

class Multiply{		//计算累乘的值
	public static double multiply(int x) {
		if (x==0) return 1; 
		double num=1;
		for(int i=1;i<=x;i++)
		{
			num*=i;
		}
		return num;
	}
}

class Ex{		//计算ex的值
	public static double ex(double x) {
		double num=0.0;
		for (int n=0;n<=10;n++)
		{
			num=num+Math.pow(x,n)*1.0/Multiply.multiply(n);
		}
		return num;
	}
}