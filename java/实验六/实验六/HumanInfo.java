package ʵ����;

public class HumanInfo {
	String id;								//��������
	String name;
	int age;
	String email;
	
	HumanInfo(){							//Ĭ��
		id=null;
		name=null;
		age=18;
		email=null;
	}
	
	HumanInfo(String s){					//���캯��
		String []ar=s.split(";",4);			//ʹ�÷ֺŷָ�ÿ�ж�ȡ��������
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
	//��ʽ�����
	public void showhuman() {
		System.out.printf("%-22s%-10s%-5s%-30s",id,name,age,email);
		System.out.println();
	}

}
