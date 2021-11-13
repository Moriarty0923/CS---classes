package 实验二;

import java.util.Scanner;

public class Student {
	int id;
	String  name;
	int age;
//构造函数
	public Student(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;	
	}
//将学生年龄+1
	public void Grow()
	{
		this.age++;
	}
//显示学生信息
	public void Showinfo()
	{
		System.out.println("学生学号为:"+this.id+"学生名字为:"+this.name
					+"学生年龄为:"+this.age+"\t");
	}
//比较年龄，大于输入值返回true
	public boolean compage(int age)
	{
		if(this.age>age) return true;
		else return false;	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入学生人数:");
		int n = in.nextInt();   
		int id;
		String name;
		int age;
//初始化学生数组
		Student []arry = new Student[n];   
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.print("请输入学生学号:");
			id = in.nextInt();
			System.out.print("请输入学生名字:");
			name = in.next();
			System.out.print("请输入学生年龄:");
			age = in.nextInt();
			arry[i] = new Student(id,name,age);
		}
//顺序显示所有学生的信息
		System.out.println("所有学生的信息:");
		for(int i = 0 ; i < n ; i++)
			arry[i].Showinfo();
//学生年龄加1后的学生信息
		System.out.println("所有学生年龄加1后所有学生信息:");
		for(int i = 0 ; i < n ; i++)
		{
			arry[i].Grow();
			arry[i].Showinfo();
		}
//查找年龄大于20的学生
		System.out.println("年龄大于20的学生:");
		for(int i = 0 ; i< n ; i++) 
		{
			if(arry[i].compage(20)) 
			{
				arry[i].Showinfo();
			}
		}
	}

}
