package Fuxiyixia;

import javax.swing.*;
import java.awt.event.*;
public class Login {
	    public Login() {
		// ���� JFrame ʵ��
	    JFrame frame = new JFrame("��¼ҳ��");
	    // Setting the width and height of frame
	    frame.setSize(350, 200);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    /* ������壬��������� HTML �� div ��ǩ
	     * ���ǿ��Դ��������岢�� JFrame ��ָ��λ��
	     * ��������ǿ�������ı��ֶΣ���ť�����������
	     */
	    JPanel panel = new JPanel();    
	    // ������
	    frame.add(panel);
	    /* 
	     * �����û�����ķ����������������
	     */
	    placeComponents(panel);
	
	    // ���ý���ɼ�
	    frame.setVisible(true);
	}

private static void placeComponents(JPanel panel) {

    /* ���ֲ���������߲���������
     * ������ò���Ϊ null
     */
    panel.setLayout(null);

    // ���� JLabel
    JLabel userLabel = new JLabel("�û���:");
    /* ������������������λ�á�
     * setBounds(x, y, width, height)
     * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
     */
    userLabel.setBounds(50,20,80,25);
    panel.add(userLabel);

    /* 
     * �����ı��������û�����
     */
    JTextField userText = new JTextField(20);
    userText.setBounds(100,20,165,25);
    panel.add(userText);

    // ����������ı���
    JLabel passwordLabel = new JLabel("����:");
    passwordLabel.setBounds(60,50,80,25);
    panel.add(passwordLabel);

    /* 
     *�����������������ı���
     * �����������Ϣ���Ե�Ŵ��棬���ڰ�������İ�ȫ��
     */
    JPasswordField passwordText = new JPasswordField(20);
    passwordText.setBounds(100,50,165,25);
    panel.add(passwordText);

    // ������¼��ť
    JButton loginButton = new JButton("��¼");
    loginButton.setBounds(70, 100, 80, 25);
    panel.add(loginButton);
    loginButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(userText.getText().equals("admin")&&new String(passwordText.getPassword()).equals("123456")){
                new Index();
            }
            else JOptionPane.showMessageDialog(null,"�û����������������");
        }
    });
    //����ȡ����ť
    JButton cancelButton = new JButton("ȡ��");
    cancelButton.setBounds(180, 100, 80, 25);
    panel.add(cancelButton);
    cancelButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}
	
	
	    public static void main(String[] args) {   
	    	new Login();
	    }
}

