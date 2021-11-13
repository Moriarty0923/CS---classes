package Fuxiyixia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//通过登录界面，说明匿名类的使用
public class JFrameGridLayoutLogin2 extends JFrame{
	//登录，事件，采用内部类
	JTextField jt;
	JPasswordField jp;
	
	JFrameGridLayoutLogin2(){
		super("welcome");
		this.setSize(200,100);
		Container ct=this.getContentPane();
		//this.setResizable(false);
		
		GridLayout gl=new GridLayout(3,2);
		ct.setLayout(gl);
		
		
		JLabel lb1=new JLabel("user name:");		
		JLabel lb2=new JLabel("password:");
		
		jt=new JTextField();
		jp=new JPasswordField();
		
		jp.setEchoChar('*');
		
		JButton bt1=new JButton();
		bt1.setText("login");	
		
		ActionListener al1=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String username=jt.getText();
				String pwd=new String(jp.getPassword());
				if (username.equals("gong")
						&& pwd.equals("123456"))
				{
					JOptionPane jpa=new JOptionPane();
					jpa.showMessageDialog(null, "pass");
					//JFrameChangecolor jc=new JFrameChangecolor();
					
					//jc.setVisible(true);
				}
				else
				{
					JOptionPane jpa=new JOptionPane();
					//jpa.showMessageDialog(null, "fail");
				
				}
			}
		};
		
		bt1.addActionListener(al1);		
		
		JButton bt2=new JButton();
		bt2.setText("close");	
		
		ActionListener al2=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		};
		bt2.addActionListener(al2);
		
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameGridLayoutLogin2 jg=new JFrameGridLayoutLogin2();
		jg.setVisible(true);
	}

}
