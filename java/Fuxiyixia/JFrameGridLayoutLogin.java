package Fuxiyixia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//通过登录界面，演示事件，顶层实现方式，注意事件参数
//通过登录界面，演示密码框的使用
public class JFrameGridLayoutLogin extends JFrame 
				implements ActionListener {
	//登录，事件，采用顶层
	JTextField jt;
	JPasswordField jp;
	
	JFrameGridLayoutLogin(){
		super("welcome");
		this.setSize(200,100);
		Container ct=this.getContentPane();
		//this.setResizable(false);
		
		GridLayout gl=new GridLayout(3,2);
		ct.setLayout(gl);
		
		
		JLabel lb1=new JLabel("user name:");		
		JLabel lb2=new JLabel("password:");
		
		jt=new JTextField();
		jt.setText("gong");
		jp=new JPasswordField();
		jp.setText("123456");
		
		jp.setEchoChar('*');
		
		JButton bt1=new JButton();
		bt1.setText("确定");
		bt1.setActionCommand("login");//如果不设置，ActionCommand就为text的值
		bt1.addActionListener(this);		
		
		JButton bt2=new JButton();
		bt2.setText("close");	
		bt2.setActionCommand("close");
		bt2.addActionListener(this);
		
		ct.add(lb1);
		ct.add(jt);
		ct.add(lb2);
		ct.add(jp);
		ct.add(bt1);
		ct.add(bt2);		
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent e){
		
		String cmdname=e.getActionCommand();
		
		if (cmdname.equals("login")){
		
			String username=jt.getText();
			String pwd=new String(jp.getPassword());
			if (username.equals("gong")
					&& pwd.equals("123456"))
			{
				JOptionPane jpa=new JOptionPane();
				jpa.showMessageDialog(this, "pass");
			}
			else
			{
				JOptionPane jpa=new JOptionPane();
				jpa.showMessageDialog(this, "fail");
			
			}
		}
		else
			System.exit(0);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameGridLayoutLogin jg=new JFrameGridLayoutLogin();
		jg.setVisible(true);
	}

}
