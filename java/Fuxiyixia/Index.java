package Fuxiyixia;
import javax.swing.*;
import java.awt.event.*;

public class Index {
    private static final int WIDTH = 300;
 
	private static final int HEIGHT = 200;
 
	public Index() {
		// ��ͨ��ť�ؼ�
		final JFrame jf = new JFrame("��ҳ");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		JLabel login= new JLabel("��½�ɹ�");
		login.setBounds(120, 200, 40, 40);
		contentPane.add(login);
		JButton close = new JButton("ȡ��");
		close.setBounds(120, 70, 60, 60);
		contentPane.add(close);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
			}
		});
	}
	public static void main(String[] args)
	{
		new Index();
	}
}

