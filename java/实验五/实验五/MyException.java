package 实验五;

public class MyException extends Exception{
/**	public String toString() {
			return "异常啦";
	}
	public String getMessage() {
		return "有错误发生";
	}**/
	String message;
	public MyException(String ErrorMessage) {
		super(ErrorMessage);
	}

	public static void main(String[] args) throws MyException  {
		try {	
		throw new MyException("有错误发生");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
