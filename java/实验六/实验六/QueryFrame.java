package 实验六;
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
		this.setTitle("查找");
		this.setSize(250,220);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		queryhandler =new Queryhandler(this);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());//设置为流式布局
		labelid = new JLabel("编号");
		labelname = new JLabel("姓名");
		labelage = new JLabel("年龄");
		labelemail = new JLabel("邮箱");
		queryButton = new JButton("查找");

		jTextFieldid = new JTextField(19);//设置文本框的长度
		jTextFieldname = new JTextField(19);//设置文本框的长度
		jTextFieldage = new JTextField(19);//设置文本框的长度
		jTextFieldemail = new JTextField(19);//设置文本框的长度

		
		panel.add(labelid);//把组件添加到面板panel
		panel.add(jTextFieldid);
		panel.add(labelname);
		panel.add(jTextFieldname);
		panel.add(labelage);
		panel.add(jTextFieldage);
		panel.add(labelemail);
		panel.add(jTextFieldemail);
		panel.add(queryButton);
		queryButton.addActionListener(queryhandler);

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
		new QueryFrame();//调用login方法
	}	
}
