package ʵ��һ;
import javax.swing.*;
public class Think2 {

	public static void main(String[] args) {
		int  F=0,P=0,M=0,G=0,E=0;	//�ֱ���F P M G E �������� 
									//���� �е� ���� �����ѧ������
		double ave=0;				//����ƽ��ֵ
		int num=0;
		while(true)		
		{
			String str = JOptionPane.showInputDialog("������ѧ������(-1��ʾ����)");
			int temp = Integer.parseInt(str);
			if(-1==temp) break;
			ave+=temp;
			num++;
			if(temp<60) F++;					//60������ΪF
			else if (60<=temp&&70>temp) P++;	//60-70��ΪP
			else if (80>temp) M++;				//70-80��ΪM
			else if(90>temp) G++;				//80-90��ΪG
			else E++;							//90-100��ΪE
		}		
		JOptionPane.showMessageDialog (null,"����������Ϊ:"+F+"\n"+
											"��������Ϊ:"+P+"\n"+
											"�е�����Ϊ:"+M+"\n"+
											"��������Ϊ:"+G+"\n"+
											"��������Ϊ:"+E+"\n"+
											"ƽ����Ϊ:"+ave/num);
	}

}
