package Fuxiyixia;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class KeyPressTest extends JFrame {
	JButton bt;
	JTextField jt;
	JLabel jl;
	KeyPressTest(){
		setSize(300,300);
		Container ct=this.getContentPane();
		JPanel jp=new JPanel();		
		//jp.setLayout(new FlowLayout());
		bt=new JButton("ok");
		jp.add(bt);
		
		jt=new JTextField(10);
		jt.setText("");	
		KeyListener kl=new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char c=e.getKeyChar();
				if (c=='\n'){
					bt.setText(jt.getText());
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub	
			}
		};
		//jt.addKeyListener(kl);
		KeyAdapter ka=new KeyAdapter(){
			//这里本质是覆盖KeyAdapter的对应方法
			public void keyPressed(KeyEvent e){			
					//jl.setText(jt.getText());
				jl.setText(jt.getText()+e.getKeyChar());
				
			}
			
		};
		/*
		KeyAdapter ka=new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				char c=e.getKeyChar();				
				if (c=='\n'){
					bt.setText(jt.getText());
				}
			}
		};
		*/	
		jt.addKeyListener(ka);
		jp.add(jt);
		
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton bt=(JButton)e.getSource();				
				JOptionPane.showMessageDialog(bt.getParent(), "welcome");
				
			}
		});
		
		jl=new JLabel("hello");
		ct.add(jl,BorderLayout.NORTH);
		ct.add(jp,BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//居中的另一种实现
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyPressTest kpt=new KeyPressTest();
		kpt.setVisible(true);
	}

}
