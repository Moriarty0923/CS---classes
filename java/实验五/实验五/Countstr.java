package 实验五;

import javax.swing.*;
public class Countstr {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("请输入一段文字");
		StringBuffer strb = new StringBuffer(str);
		StringBuffer allchar = new StringBuffer();	//存放所有出现的字符
		StringBuffer charnum = new StringBuffer();	//存放字符对应的出现次数
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
