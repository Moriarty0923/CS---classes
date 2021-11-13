package 实验六;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Queryhandler implements ActionListener{
	
	private QueryFrame query;
	ArrayList<HumanInfo> info=new ArrayList();			//用于存放所有的记录
	ArrayList<HumanInfo> queryres=new ArrayList();		//用于记录查找的结果
	
	public Queryhandler(QueryFrame query) {
		this.query=query;
	}
	
	//读取文件中的内容，将信息存放到info数组中
	public void getinfo() {
		System.out.println("开始查找...");
		File file=new File("D:\\eclipse java\\java课程实验\\src\\实验六\\src.txt");
		BufferedReader reader=null;
		String temp=null;

		try{
			InputStreamReader fReader = new InputStreamReader(new FileInputStream(file),"GBK");
			reader = new BufferedReader(fReader);
		   while((temp=reader.readLine())!=null){
			    HumanInfo temphuman=new HumanInfo(temp);
			    info.add(temphuman);
		   }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(reader!=null){
				try{
					reader.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	//保存查找到的记录
	public void saveinfo(ArrayList<HumanInfo>arry) {
		System.out.println("正在保存...");
		//创建bufferedwriter对象
        BufferedWriter bw = null;
        //创建FileWriter对象
        FileWriter fw = null;
        try {

            fw = new FileWriter("D:\\eclipse java\\java课程实验\\src\\实验六\\rst.txt");
            bw = new BufferedWriter(fw);
            for(HumanInfo temp:arry) {
            	String s=String.format("%-22s%-10s%-5s%-30s",temp.id,temp.name,temp.age,temp.email);
            	bw.write(s+"\n");
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
            if (bw != null) {
                try {
                    {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } 
	}
	public boolean fuck(HumanInfo temp,String id,String name,int age,String email) {
		if(id.length()!=0&&temp.id.indexOf(id)==-1) return false;
		if(name.length()!=0&&temp.name.indexOf(name)==-1) return false;
		if(age!=-1&&temp.age!=age) return false;
		if(email.length()!=0&&temp.email.indexOf(email)==-1) return false;
		return true;
	}
	
	//在数据中查找符合输入的记录
	public void anlyinfo(String id,String name,int age,String email) {
		
		for(HumanInfo temp:info) {

			if(fuck(temp,id,name,age,email))
			{
				queryres.add(temp);
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		//获取文本框中输入的信息，分别存入临时变量
		String	id,name,email;
		int age;
		if(query.getlabelid().getText().isEmpty()) id="";
		else id=query.getlabelid().getText();
		if(query.getlabelname().getText().isEmpty()) name="";
		else name=query.getlabelname().getText();
		if(query.getlabelage().getText().isEmpty()) age=-1;
		else age=Integer.parseInt(query.getlabelage().getText());
		if(query.getlabelemail().getText().isEmpty()) email="";
		else email=query.getlabelemail().getText();

		getinfo();

		anlyinfo(id,name,age,email);
		

		
		if(queryres.size()==0) {
			System.out.println("没有查询到记录");
		}
		else {

			System.out.println("查找结果如下:");
			System.out.printf("%-20s%-10s%-5s%-30s","编号","姓名","年龄","邮箱");
			System.out.println("");
			
			queryres.sort(new HumanComparator());	//排序
			for(HumanInfo temp:queryres) {
				temp.showhuman();
			}
			saveinfo(queryres);
			System.out.println("保存完毕。");
		}
	}
}
