package ʵ����;
import javax.swing.*;
public class Exceptiontest {
	public static void main(String[] args) {
	try 
	{
		String word[]= {"good","bad","ok","bye"};
		String s = JOptionPane.showInputDialog("������һ����:");
		int n =Integer.parseInt(s);
		System.out.println(word[n]);
	}
	
	catch(NumberFormatException e) {
		System.out.println("Ҫ����������");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("������ʳ���");
	}
	 catch(Exception e) {
		 System.out.println("�д�����");
	 }
	finally {
		System.out.println("finally part");
	}
	}
}
