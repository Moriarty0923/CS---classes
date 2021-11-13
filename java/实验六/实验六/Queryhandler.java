package ʵ����;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Queryhandler implements ActionListener{
	
	private QueryFrame query;
	ArrayList<HumanInfo> info=new ArrayList();			//���ڴ�����еļ�¼
	ArrayList<HumanInfo> queryres=new ArrayList();		//���ڼ�¼���ҵĽ��
	
	public Queryhandler(QueryFrame query) {
		this.query=query;
	}
	
	//��ȡ�ļ��е����ݣ�����Ϣ��ŵ�info������
	public void getinfo() {
		System.out.println("��ʼ����...");
		File file=new File("D:\\eclipse java\\java�γ�ʵ��\\src\\ʵ����\\src.txt");
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
	
	//������ҵ��ļ�¼
	public void saveinfo(ArrayList<HumanInfo>arry) {
		System.out.println("���ڱ���...");
		//����bufferedwriter����
        BufferedWriter bw = null;
        //����FileWriter����
        FileWriter fw = null;
        try {

            fw = new FileWriter("D:\\eclipse java\\java�γ�ʵ��\\src\\ʵ����\\rst.txt");
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
	
	//�������в��ҷ�������ļ�¼
	public void anlyinfo(String id,String name,int age,String email) {
		
		for(HumanInfo temp:info) {

			if(fuck(temp,id,name,age,email))
			{
				queryres.add(temp);
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		//��ȡ�ı������������Ϣ���ֱ������ʱ����
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
			System.out.println("û�в�ѯ����¼");
		}
		else {

			System.out.println("���ҽ������:");
			System.out.printf("%-20s%-10s%-5s%-30s","���","����","����","����");
			System.out.println("");
			
			queryres.sort(new HumanComparator());	//����
			for(HumanInfo temp:queryres) {
				temp.showhuman();
			}
			saveinfo(queryres);
			System.out.println("������ϡ�");
		}
	}
}
