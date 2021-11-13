package ʵ����;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class QueryFrame extends JFrame{
	JPanel panel;
	JLabel labelid,labelname,labelage,labelemail;
	JButton queryButton;
	JTextField jTextFieldid,jTextFieldname,jTextFieldage,jTextFieldemail;
	Queryhandler queryhandler;
	
	public QueryFrame() {
		this.setTitle("����");
		this.setSize(250,220);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		queryhandler =new Queryhandler(this);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());//����Ϊ��ʽ����
		labelid = new JLabel("���");
		labelname = new JLabel("����");
		labelage = new JLabel("����");
		labelemail = new JLabel("����");
		queryButton = new JButton("����");

		jTextFieldid = new JTextField(19);//�����ı���ĳ���
		jTextFieldname = new JTextField(19);//�����ı���ĳ���
		jTextFieldage = new JTextField(19);//�����ı���ĳ���
		jTextFieldemail = new JTextField(19);//�����ı���ĳ���

		
		panel.add(labelid);//�������ӵ����panel
		panel.add(jTextFieldid);
		panel.add(labelname);
		panel.add(jTextFieldname);
		panel.add(labelage);
		panel.add(jTextFieldage);
		panel.add(labelemail);
		panel.add(jTextFieldemail);
		panel.add(queryButton);
		queryButton.addActionListener(queryhandler);

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
		new QueryFrame();//����login����
	}	
}
