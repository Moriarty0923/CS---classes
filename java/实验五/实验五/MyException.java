package ʵ����;

public class MyException extends Exception{
/**	public String toString() {
			return "�쳣��";
	}
	public String getMessage() {
		return "�д�����";
	}**/
	String message;
	public MyException(String ErrorMessage) {
		super(ErrorMessage);
	}

	public static void main(String[] args) throws MyException  {
		try {	
		throw new MyException("�д�����");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
