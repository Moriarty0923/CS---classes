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
			this.setTitle("����");
			this.setSize(250,220);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			panel = new JPanel();
			panel.setLayout(new BorderLayout());//����Ϊ��ʽ��	
			labelid = new JLabel("���");
			labelname = new JLabel("����");
			labelage = new JLabel("����");
			labelemail = new JLabel("����");
			queryButton = new JButton("����");
			queryButton.setSize(20,10);

			jTextFieldid = new JTextField(5);//�����ı���ĳ���
			jTextFieldname = new JTextField(5);//�����ı���ĳ���
			jTextFieldage = new JTextField(5);//�����ı���ĳ���
			jTextFieldemail = new JTextField(5);//�����ı���ĳ���

			
			panel.add(labelid,BorderLayout.CENTER);//�������ӵ����panel
			panel.add(jTextFieldid,BorderLayout.CENTER);
			panel.add(labelname,BorderLayout.CENTER);
			panel.add(jTextFieldname,BorderLayout.NORTH);
			panel.add(labelage,BorderLayout.SOUTH);
			panel.add(jTextFieldage,BorderLayout.SOUTH);
			panel.add(labelemail,BorderLayout.WEST);
			panel.add(jTextFieldemail,BorderLayout.EAST);
			panel.add(queryButton,BorderLayout.CENTER);


			this.add(panel);//ʵ�����panel
			this.setVisible(true);//���ÿɼ�
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
			new bianjiebuju();//����login����
		}	
	}



