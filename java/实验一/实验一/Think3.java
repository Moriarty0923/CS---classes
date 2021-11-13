package 实验一;

public class Think3 {

	public static void main(String[] args) {
		int rec=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0||i%5==0)		//能被3或5整除
			{
				System.out.print(String.format("%5d",i)); //控制格式
				rec++;
				if(rec%5==0)		//控制每行输出5个
					System.out.print("\n");
			}
		}
	}
}
