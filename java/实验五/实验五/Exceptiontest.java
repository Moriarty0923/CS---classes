package 实验五;
import javax.swing.*;
public class Exceptiontest {
	public static void main(String[] args) {
	try 
	{
		String word[]= {"good","bad","ok","bye"};
		String s = JOptionPane.showInputDialog("请输入一个数:");
		int n =Integer.parseInt(s);
		System.out.println(word[n]);
	}
	
	catch(NumberFormatException e) {
		System.out.println("要求输入整数");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("数组访问出界");
	}
	 catch(Exception e) {
		 System.out.println("有错误发生");
	 }
	finally {
		System.out.println("finally part");
	}
	}
}
