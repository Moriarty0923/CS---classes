package 实验六;

public class HumanInfo {
	String id;								//基本属性
	String name;
	int age;
	String email;
	
	HumanInfo(){							//默认
		id=null;
		name=null;
		age=18;
		email=null;
	}
	
	HumanInfo(String s){					//构造函数
		String []ar=s.split(";",4);			//使用分号分割每行读取到的数据
		id=ar[0];
		name=ar[1];
		age=Integer.valueOf(ar[2]);
		email=ar[3];
	}
	
	String getid() {
		return id;
	}
	
	String getname() {
		return name;
	}
	
	int getage() {
		return age;
	}
	
	String getemail() {
		return email;
	}
	//格式化输出
	public void showhuman() {
		System.out.printf("%-22s%-10s%-5s%-30s",id,name,age,email);
		System.out.println();
	}

}
