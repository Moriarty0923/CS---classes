package ʵ��һ;

public class Think3 {

	public static void main(String[] args) {
		int rec=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0||i%5==0)		//�ܱ�3��5����
			{
				System.out.print(String.format("%5d",i)); //���Ƹ�ʽ
				rec++;
				if(rec%5==0)		//����ÿ�����5��
					System.out.print("\n");
			}
		}
	}
}
