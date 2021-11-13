package 实验一;
import javax.swing.*;
public class Think2 {

	public static void main(String[] args) {
		int  F=0,P=0,M=0,G=0,E=0;	//分别用F P M G E 代表不及格 
									//及格 中等 良好 优秀的学生人数
		double ave=0;				//计算平均值
		int num=0;
		while(true)		
		{
			String str = JOptionPane.showInputDialog("请输入学生分数(-1表示结束)");
			int temp = Integer.parseInt(str);
			if(-1==temp) break;
			ave+=temp;
			num++;
			if(temp<60) F++;					//60以下视为F
			else if (60<=temp&&70>temp) P++;	//60-70视为P
			else if (80>temp) M++;				//70-80视为M
			else if(90>temp) G++;				//80-90视为G
			else E++;							//90-100视为E
		}		
		JOptionPane.showMessageDialog (null,"不及格人数为:"+F+"\n"+
											"及格人数为:"+P+"\n"+
											"中等人数为:"+M+"\n"+
											"良好人数为:"+G+"\n"+
											"优秀人数为:"+E+"\n"+
											"平均分为:"+ave/num);
	}

}
