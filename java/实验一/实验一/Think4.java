package 实验一;

import javax.swing.*;
public class Think4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("请输入十进制数:");
		int num = Integer.parseInt(str);        //num表示输入的十进制数
		str = JOptionPane.showInputDialog("请输入想要获得的进制:");
		int  trans = Integer.parseInt(str); 	//trans表示目标进制
		
		str="";
		int remain=0;
		int originnum=num;
		
		while(num!=0)
		{
			remain=num%trans;
			if (remain>=10) remain=remain-10+'a';
			str=remain+str;
			num/=trans;
		}
		JOptionPane.showMessageDialog(null,"十进制数"+originnum+"转换为"
										+trans+"进制结果为:\n"+str);
	}
}
