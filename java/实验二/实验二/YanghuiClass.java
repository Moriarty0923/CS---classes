package ʵ���;
//˼����ʵ��B1
import java.util.Scanner;
public class YanghuiClass
{
	int n;					//��¼����
	int [][]arry;			//���ݴ洢��������
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
	public void printt(int n){       //ÿ��ǰ�ġ�t�����
		for(int i = 0 ; i < n ; i++) {
			System.out.print('\t');
		}
	}
	public void print() {            //��ӡ�������
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
		System.out.print("����������n:");
		int n = input.nextInt();
		input.close();
		YanghuiClass tri = new YanghuiClass(n);
		tri.print();
	}
}
