package ʵ���;

import java.util.Scanner;

public class Student {
	int id;
	String  name;
	int age;
//���캯��
	public Student(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;	
	}
//��ѧ������+1
	public void Grow()
	{
		this.age++;
	}
//��ʾѧ����Ϣ
	public void Showinfo()
	{
		System.out.println("ѧ��ѧ��Ϊ:"+this.id+"ѧ������Ϊ:"+this.name
					+"ѧ������Ϊ:"+this.age+"\t");
	}
//�Ƚ����䣬��������ֵ����true
	public boolean compage(int age)
	{
		if(this.age>age) return true;
		else return false;	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ѧ������:");
		int n = in.nextInt();   
		int id;
		String name;
		int age;
//��ʼ��ѧ������
		Student []arry = new Student[n];   
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.print("������ѧ��ѧ��:");
			id = in.nextInt();
			System.out.print("������ѧ������:");
			name = in.next();
			System.out.print("������ѧ������:");
			age = in.nextInt();
			arry[i] = new Student(id,name,age);
		}
//˳����ʾ����ѧ������Ϣ
		System.out.println("����ѧ������Ϣ:");
		for(int i = 0 ; i < n ; i++)
			arry[i].Showinfo();
//ѧ�������1���ѧ����Ϣ
		System.out.println("����ѧ�������1������ѧ����Ϣ:");
		for(int i = 0 ; i < n ; i++)
		{
			arry[i].Grow();
			arry[i].Showinfo();
		}
//�����������20��ѧ��
		System.out.println("�������20��ѧ��:");
		for(int i = 0 ; i< n ; i++) 
		{
			if(arry[i].compage(20)) 
			{
				arry[i].Showinfo();
			}
		}
	}

}
