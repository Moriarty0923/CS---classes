package ʵ���;
class Node
{
	int data;
	Node next;
//�ڵ㶨��
	public Node() 
	{
		data = (int)(Math.random()*100);
		next = null;
	}
}
class LinkList
{
	Node first;       
//�޲ι��캯��
	public LinkList()
	{             
		first = new Node();
	}
//���캯��,lengthΪ������
	public LinkList(int length) 
	{  
		first = new Node();
		for(int i = 0 ; i < length ; i++)
		{
			Node s = new Node();
			s.data = (int)(Math.random()*100);
			s.next = first.next;
			first.next = s;
		}
	}
	public void Showinfo()
	{
		Node s = first;
		while (s != null)
		{
			System.out.print(s.data+" ");
			s = s.next;
		}
		System.out.println();
	}

//����β���һ������ֵΪ100�Ľ��
	public void insert100() 
	{  
		Node s = new Node();   
		s.next = first;
		s.data = 100;
		first = s;
		Node p = first;       
		while( p.next != null) 
		{
			p = p.next;
		}
		Node tail = new Node();
		p.next = tail ;
		tail.data = 100;
	}
}

public class List {
	public static void main(String[] args) {
		LinkList linklist = new LinkList(10);
		linklist.Showinfo();
		linklist.insert100();
		linklist.Showinfo();
	}
}
