package ʵ����;

import javax.swing.*;
public class Countstr {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("������һ������");
		StringBuffer strb = new StringBuffer(str);
		StringBuffer allchar = new StringBuffer();	//������г��ֵ��ַ�
		StringBuffer charnum = new StringBuffer();	//����ַ���Ӧ�ĳ��ִ���
		int count ;
		while(!strb.isEmpty()) {
			count =0;
			String temp =strb.substring(0,1);
			allchar.append(temp);
			while(strb.lastIndexOf(temp)!=0) {
				count++;
				strb.replace(strb.lastIndexOf(temp), strb.lastIndexOf(temp)+1,"");
			}
			charnum.append(String.valueOf(count+1));
			strb.replace(0, 1, "");
		}
		for(int i=0;i<allchar.length();i++) {
			System.out.println(allchar.charAt(i)+":"+charnum.charAt(i));
		}
	}
}
