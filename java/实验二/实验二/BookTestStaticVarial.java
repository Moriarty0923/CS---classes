package ʵ���;
import java.util.Scanner;
class Book {
	public String title;
	public int salenumber;
	static int gensalenumber=0;
//���캯��
	public Book(String t,int s)
	{
		this.title=t;
		this.salenumber=s;
	}
//����num����
	public void Sale(int num)
	{
		this.salenumber+=num;
		gensalenumber+=num;
	}

	public void Showinfo()
	{
		System.out.println("����:"+this.title+"  ��������:"+this.salenumber);
		
	}
}

public class BookTestStaticVarial {
	public static void main(String[] args) {
		Book book1 = new Book("Book1",0);
		Book book2 = new Book("Book2",0);
		Book book3 = new Book("Book3",0);
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("��������������n:");
		n = input.nextInt();
		String title ; 
		int num;
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.println("������������ôε�������:");
			title = input.next();
			num = input.nextInt();
			switch(title)
			{
			case "Book1":
				book1.Sale(num);break;
			case "Book2":
				book2.Sale(num);break;
			case "Book3":
				book3.Sale(num);break;
			default:System.out.println("��������");break;
			}
		}
		input.close();
		System.out.println("��������:"+Book.gensalenumber);
		book1.Showinfo();
		book2.Showinfo();
		book3.Showinfo();
	}
}

