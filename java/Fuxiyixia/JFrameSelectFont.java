package Fuxiyixia;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
//—› æitemListener
public class JFrameSelectFont extends JFrame{
	JCheckBox jcb1;
	JCheckBox jcb2;
	JLabel jl;
	JFrameSelectFont(){
		this.setSize(300,400);			
		
		jl=new JLabel("how are you");
		
		Container ct=this.getContentPane();
		//default is BorderLayout		
		ct.add(jl,BorderLayout.CENTER);
		
		JPanel pl=new JPanel();
		jcb1=new JCheckBox("¥÷ÃÂ");
		jcb2=new JCheckBox("–±ÃÂ");
		
				
		ItemListener il=new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				int fontstyle=0;
				if (jcb1.isSelected())
					fontstyle+=Font.BOLD;				
				if (jcb2.isSelected())
					fontstyle+=Font.ITALIC;					
				jl.setFont(new Font(jl.getFont().getFamily(),fontstyle,16));
					
			}
		};
		jcb1.addItemListener(il);
		jcb2.addItemListener(il);
		
		pl.add(jcb1);
		pl.add(jcb2);
		ct.add(pl,BorderLayout.SOUTH);		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameSelectFont jsf=new JFrameSelectFont();
		jsf.setVisible(true);
	}

}
