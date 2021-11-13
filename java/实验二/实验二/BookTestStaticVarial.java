package 实验二;
import java.util.Scanner;
class Book {
	public String title;
	public int salenumber;
	static int gensalenumber=0;
//构造函数
	public Book(String t,int s)
	{
		this.title=t;
		this.salenumber=s;
	}
//卖出num本书
	public void Sale(int num)
	{
		this.salenumber+=num;
		gensalenumber+=num;
	}

	public void Showinfo()
	{
		System.out.println("书名:"+this.title+"  该书销量:"+this.salenumber);
		
	}
}

public class BookTestStaticVarial {
	public static void main(String[] args) {
		Book book1 = new Book("Book1",0);
		Book book2 = new Book("Book2",0);
		Book book3 = new Book("Book3",0);
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("输入总卖出次数n:");
		n = input.nextInt();
		String title ; 
		int num;
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.println("输入书名及其该次的销售量:");
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
			default:System.out.println("输入有误");break;
			}
		}
		input.close();
		System.out.println("总销售量:"+Book.gensalenumber);
		book1.Showinfo();
		book2.Showinfo();
		book3.Showinfo();
	}
}

