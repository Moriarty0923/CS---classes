package Fuxiyixia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusDemo extends JFrame{
	JTextField jt;
	FocusDemo(){
		this.setSize(400,300);
		Container ct=this.getContentPane();
		ct.setLayout(new GridLayout(2,2));
		
		JLabel jl2=new JLabel("请输入用户名");
		final JTextField jt2=new JTextField();
		jt2.setText("");
		ct.add(jl2);
		ct.add(jt2);
		
		JLabel jl=new JLabel("请输入银行卡号");
		//final JTextField jt=new JTextField();
		jt=new JTextField();
		jt.setText("01*****");
		jt.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				jt.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (jt.getText().trim().length()==0)
					jt.setText("01*****");
			}
		});
		ct.add(jl);
		ct.add(jt);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocusDemo fd=new FocusDemo();
		fd.setVisible(true);
	}
}
