package ʵ��һ;
import javax.swing.*;
public class Think1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("������n��ֵ");
		int n = Integer.parseInt(str);
		int count=0;
		for (int i=0;i<=n;i++)
		{
			count+=Math.pow(2, i);
		}
		JOptionPane.showMessageDialog (null,"���="+count);
	}
}
