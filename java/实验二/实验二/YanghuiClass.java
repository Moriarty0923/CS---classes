package 实验二;
//思考型实验B1
import java.util.Scanner;
public class YanghuiClass
{
	int n;					//记录行数
	int [][]arry;			//数据存储在数组中
	public YanghuiClass(int n) {  
		this.n = n;
		arry = new int[n][];
		for (int i = 0 ; i < n ; i++ ) {
			arry[i] = new int[i+1] ;
			arry[i][0] = 1 ;
			arry[i][i] = 1;
		}
		for(int i=2 ; i<n ; i++){
			for(int j = 1 ; j < i ; j++)
				arry[i][j]=arry[i-1][j-1]+arry[i-1][j];
		}
	}
	public void printt(int n){       //每行前的‘t’输出
		for(int i = 0 ; i < n ; i++) {
			System.out.print('\t');
		}
	}
	public void print() {            //打印杨辉三角
		for(int i = 0 ; i < n ; i++ ) {
			for(int k = 0 ; k< n-i-1 ; k++) {
				System.out.print('\t');}
			for(int j = 0 ; j < arry[i].length ; j++) {
				System.out.print(arry[i][j]);
				if(j != arry[i].length-1) {System.out.print('\t');System.out.print('\t');}
				if(j == arry[i].length-1) {System.out.println();}
			}
		}
}
	

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行数n:");
		int n = input.nextInt();
		input.close();
		YanghuiClass tri = new YanghuiClass(n);
		tri.print();
	}
}
