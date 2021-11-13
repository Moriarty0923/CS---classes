package สตั้ศý;

public class course {
	String courseID;
	String courseName;
	int credit;
	String teacher;
	
	public course() {
		courseID="";
		courseName="";
		credit=0;
		teacher="";
	}
	
	public course(String courseID) {
		this.courseID=courseID;
		courseName="";
		credit=0;
		teacher="";
	}
	
	public course(String courseID,String courseName) {
		this.courseID=courseID;
		this.courseName=courseName;
		credit=0;
		teacher="";
		System.out.println("runing case 2");
	}
	/**
	public course(String courseID,String courseName,int credit) {
		this(courseID,courseName);
		this.credit=credit;
		teacher="";		
	}		
	**/
	public course(String courseID,String courseName,int credit) {
		this(courseID,courseName,credit," ");
	}	

	public course(String courseID,String courseName,int credit,String teacher) {
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;		
		System.out.println("runing case 4 ");
	}	
	
	public static void main(String[] args) {
		 course exp= new course("1","java",2);
		 System.out.println("courseid:"+exp.courseID+"\n"+
				 			"coursename:"+exp.courseName+"\n"+
				 			"coursecredit:"+exp.credit+"\n"+
				 			"courseteacher:"+exp.teacher);
	}
}
