package ʵ��һ;

public class test7 {

	public static void main(String[] args) {
		int x[]=new int[20];
		int ave=0;
		for(int k=0;k<x.length;k++)
		{
			x[k]=100+(int)(Math.random()*900);
			System.out.print(x[k]+" ");
			ave+=x[k];
		}
		System.out.print("\n"+"ƽ��ֵΪ"+(ave/20));
	}
}
