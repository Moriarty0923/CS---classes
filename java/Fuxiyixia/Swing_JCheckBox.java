package Fuxiyixia;

import java.awt.*;		//����
import javax.swing.*;	
public class Swing_JCheckBox extends JFrame {	//�̳�JFrame����������
	
	//�������
	JPanel jp1,jp2,jp3;			//����������
	JLabel jlb1,jlb2;			//�����ǩ���
	JButton jb1,jb2;			//���尴ť���
	JCheckBox jcb1,jcb2,jcb3;	//�����ѡ�����
	JRadioButton jrb1,jrb2,jrb3;		//���嵥ѡ�����
	ButtonGroup bg;				//���尴ť�飨ע�����������������Ǹ���������ֻ�ǰ���������������ѣ�
	public static void main(String[] args) {
		Swing_JCheckBox a=new Swing_JCheckBox();	//��ʾ����
 
	}
	public Swing_JCheckBox()
	{
		//�������
		jp1=new JPanel();	//�������
		jp2=new JPanel();
		jp3=new JPanel();
		jb1=new JButton("ע���û�");		//������ť
		jb2=new JButton("ȡ��ע��");
		jlb1=new JLabel("����ϲ�����˶�");	//������ǩ
		jlb2=new JLabel("����Ա�");
		jcb1=new JCheckBox("����");			//������ѡ��
		jcb2=new JCheckBox("����");
		jcb3=new JCheckBox("����");
		jrb1=new JRadioButton("��");			//������ѡ��
		jrb2=new JRadioButton("Ů");
		jrb3=new JRadioButton("ͯ��");
		bg=new ButtonGroup();				//������ť��
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,1));	//����һ�����񲼾�
		
		//������
		this.add(jp1);			//����������
		this.add(jp2);
		this.add(jp3);
		
		jp1.add(jlb1);			//������1�����
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jlb2);			//������2�����	
		bg.add(jrb1);			//����Ҫ�ѵ�ѡ����밴ť���������в���ʵ�ֵ�ѡ��������
		bg.add(jrb2);
		bg.add(jrb3);
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		
		jp3.add(jb1);			//������3�����
		jp3.add(jb2);
		
		//���ô�������
		this.setTitle("�û�ע�����");		//���ý������
		this.setSize(350, 150);				//���ý�������
		this.setLocation(200, 200);			//���ý����ʼλ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����������ͽ���һͬ�ر�
		this.setVisible(true);				//���ý�����ӻ�
	}
}