package Fuxiyixia;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class bianjiebuju extends JFrame {


		JPanel panel;
		JLabel labelid,labelname,labelage,labelemail;
		JButton queryButton;
		JTextField jTextFieldid,jTextFieldname,jTextFieldage,jTextFieldemail;

		
		public bianjiebuju() {
			this.setTitle("查找");
			this.setSize(250,220);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			panel = new JPanel();
			panel.setLayout(new BorderLayout());//设置为流式布	
			labelid = new JLabel("编号");
			labelname = new JLabel("姓名");
			labelage = new JLabel("年龄");
			labelemail = new JLabel("邮箱");
			queryButton = new JButton("查找");
			queryButton.setSize(20,10);

			jTextFieldid = new JTextField(5);//设置文本框的长度
			jTextFieldname = new JTextField(5);//设置文本框的长度
			jTextFieldage = new JTextField(5);//设置文本框的长度
			jTextFieldemail = new JTextField(5);//设置文本框的长度

			
			panel.add(labelid,BorderLayout.CENTER);//把组件添加到面板panel
			panel.add(jTextFieldid,BorderLayout.CENTER);
			panel.add(labelname,BorderLayout.CENTER);
			panel.add(jTextFieldname,BorderLayout.NORTH);
			panel.add(labelage,BorderLayout.SOUTH);
			panel.add(jTextFieldage,BorderLayout.SOUTH);
			panel.add(labelemail,BorderLayout.WEST);
			panel.add(jTextFieldemail,BorderLayout.EAST);
			panel.add(queryButton,BorderLayout.CENTER);


			this.add(panel);//实现面板panel
			this.setVisible(true);//设置可见
		}

		public JTextField getlabelname() {
			return jTextFieldname;
		}
		public JTextField getlabelid() {
			return jTextFieldid;
		}
		public JTextField getlabelage() {
			return jTextFieldage;
		}
		public JTextField getlabelemail() {
			return jTextFieldemail;
		}
		
		
		public static void main(String[] args) {
			new bianjiebuju();//调用login方法
		}	
	}



