package ʵ��һ;

import javax.swing.*;
public class Think4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("������ʮ������:");
		int num = Integer.parseInt(str);        //num��ʾ�����ʮ������
		str = JOptionPane.showInputDialog("��������Ҫ��õĽ���:");
		int  trans = Integer.parseInt(str); 	//trans��ʾĿ�����
		
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
		JOptionPane.showMessageDialog(null,"ʮ������"+originnum+"ת��Ϊ"
										+trans+"���ƽ��Ϊ:\n"+str);
	}
}
