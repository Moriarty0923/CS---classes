package 实验一;
import javax.swing.*;
public class Think1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("请输入n的值");
		int n = Integer.parseInt(str);
		int count=0;
		for (int i=0;i<=n;i++)
		{
			count+=Math.pow(2, i);
		}
		JOptionPane.showMessageDialog (null,"结果="+count);
	}
}
