package 实验四;
interface Sortable {
	 abstract int Compare(Sortable s);
}

class Student implements Sortable{
	int score;
	public Student(int x) {this.score=x;}
	public String toString() {
		return "成绩为"+score;
	}
	public int Compare(Sortable s) {
		if(this.score>((Student)s).score) return 1;
		else if(this.score==((Student)s).score) return 0;
		else  return -1;
	}
}

class Rectangle implements Sortable {
	int length;
	int width;
	public Rectangle(int l,int w) {this.length=l;this.width=w;};
	public int area()  { return length*width; };
	public String toString() { return "长度为"+length+"   宽度为"+width;};
	public int Compare(Sortable s) {
		if(this.area()>((Rectangle)s).area()) return 1;
		else if(this.area()==((Rectangle)s).area()) return 0;
		else  return -1;
	}
}
//升序
class Sort{
	public static void SelectSort(Sortable []a) {
		Sortable temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].Compare(a[j])>=0) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
}

/**
//降序
class Sort{
	public static void SelectSort(Sortable []a) {
		Sortable temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j].Compare(a[i])<=0) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
}
**/

public class TestSort {
	TestSort(){
		Student[] s=new Student[5];
		for(int i=0;i<s.length;i++){
			s[i]=new Student((int)(Math.random()*100));
		}
		Sort.SelectSort(s);
		System.out.println("下面是按升序输出学生成绩");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		Rectangle[] ss=new Rectangle[5];
		for(int i=0;i<ss.length;i++){
			ss[i]=new Rectangle((int)(Math.random()*100),(int)(Math.random()*100));
		}
		Sort.SelectSort(ss);
		System.out.println("下面是按升序输出矩形面积");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	 }
	public static void main(String[] args) {
		new TestSort();
	}
}
