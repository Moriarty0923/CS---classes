package 实验五;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
class WrongDateFormat extends Exception
{
	public WrongDateFormat()
	{
		System.out.println("参数必须是符合yyyy/mm/dd格式的日期字符串");
	}
}
public class Checkdate {
//判断是否为数字
	boolean isnumber(String num)   
	{
		for(int i = 0 ; i < num.length() ; i++ )
		{
			if(!Character.isDigit(num.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
//检查日期是否正确
	boolean check(String[]arry)   
	{
		for(int i=0;i<3;i++) {
			if(!isnumber(arry[i])) return false;
			
		}
			int a=Integer.parseInt(arry[0]);
			if(a<0||a>2021) return false;
			int b=Integer.parseInt(arry[1]);
			if(b<0||b>12) return false;
			int c=Integer.parseInt(arry[2]);
			if(c<0||c>31) return false;
		return true;
	}
	public void checkDateInput (String str)throws WrongDateFormat, ParseException
	{
		//检查格式
		if(str.split("/").length!=3) {
			throw new WrongDateFormat();
		}
		//检查日期是否正确
		else{
			if(!check(str.split("/"))) {
				throw new WrongDateFormat();
			}
		}
		SimpleDateFormat simpledate = new SimpleDateFormat ("yyyy/MM/dd");
		Date date = simpledate.parse(str);
		System.out.println(simpledate.format(date));
	}	
 /**		try 
		{	
			SimpleDateFormat simple = new SimpleDateFormat ("yyyy/MM/dd");
			Date date = simple.parse(str);
			int x = 5 + (int)(Math.random()*5);   // 生成5到10的随机数
			int []week= {6,7,1,2,3,4,5};
			Calendar c1 = Calendar.getInstance();
			c1.set(Calendar.YEAR,Integer.parseInt(str.split("/")[0]));
			c1.set(Calendar.MONTH,Integer.parseInt(str.split("/")[1])-1);
			c1.set(Calendar.DATE,Integer.parseInt(str.split("/")[2]));
			c1.add(Calendar.DATE,x);
			int y = week[c1.get(Calendar.DAY_OF_WEEK)];
			String newdate = simpledate.format(c1.getTime());
			System.out.println(str+"日期"+x+"天后的日期为"+newdate+"这一天是星期"+y);
		}
		catch(ParseException p)
		{
			System.out.println("参数必须是符合yyyy/mm/dd格式的日期字符串");
		}**/

	public static void main(String[] args) throws WrongDateFormat, ParseException {
		// TODO Auto-generated method stub
		Checkdate example = new Checkdate();
		System.out.println("请输入日期:");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		example.checkDateInput(str);
	}
}
