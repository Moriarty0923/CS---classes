package ʵ��һ;
public class Think5 {
	public static void main(String[] args) {
		System.out.println("x=0.2~1.0֮�䲽��Ϊ0.2������ex��ֵ�ֱ�Ϊ:");
		for(double x=0.2;x<=1.0;x+=0.2) {			//����x=0.2~1.0 ����Ϊ0.2��exֵ
			double res = Ex.ex(x);
			System.out.println(" x= "+String.format("%.1f",x)+" ʱE^x= "+String.format("%.5f", res));
		}											//���㾫��Ϊ0.00001
	}
}

class Multiply{		//�����۳˵�ֵ
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

class Ex{		//����ex��ֵ
	public static double ex(double x) {
		double num=0.0;
		for (int n=0;n<=10;n++)
		{
			num=num+Math.pow(x,n)*1.0/Multiply.multiply(n);
		}
		return num;
	}
}