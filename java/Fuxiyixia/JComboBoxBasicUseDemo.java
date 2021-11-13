package Fuxiyixia;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
/*
 * ��ʾJComboBox�Ļ����÷����Լ��¼���Ӧ
 */
public class JComboBoxBasicUseDemo extends JFrame{
  private static final long serialVersionUID = -8161981948004677531L;
  int DEFAULT_WIDTH = 600;
  int DEFAULT_HEIGHT = 400;
  private JLabel label,label1;
  private JComboBox<String> faceCombo;
  private static final int FONTSIZE = 12;  
  @SuppressWarnings("unused")
    public JComboBoxBasicUseDemo(){
    setTitle("JComboBoxDemo ");
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    
    //���label
    label = new JLabel("��ӭ");
    label.setFont(new Font("Serif",Font.PLAIN, FONTSIZE));
    label.setPreferredSize(new Dimension(0,100));
    add(label, BorderLayout.NORTH);
    
    label1 = new JLabel();
    label1.setPreferredSize(new Dimension(0,100));
    add(label1, BorderLayout.SOUTH);
    
    //actionListener
    ActionListener actionListener = new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JComboBox){
          @SuppressWarnings({ "unchecked", "rawtypes" })
          JComboBox<String> comboBox = (JComboBox)e.getSource();
          String fontName = comboBox.getSelectedItem().toString();
          label.setFont(new Font(fontName, Font.PLAIN, FONTSIZE));
          System.out.printf("%s%n", "actionPerformed called");
        }
      }
    };
    
    //popupMenuListener
    PopupMenuListener popupMenuListener = new PopupMenuListener() {
      @Override
      public void popupMenuCanceled(PopupMenuEvent e) {
        System.out.println("�����˵�ȡ��");
      }
      @SuppressWarnings("unchecked")
            @Override
      public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        System.out.println("�����˵�����");
        JComboBox<String> source = (JComboBox<String>)e.getSource();
      }
      @Override
      public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        System.out.println("�����˵�����");
      }
    };
    
    //itemListener
    ItemListener itemListener = new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent arg0) {
        // TODO Auto-generated method stub
        if(ItemEvent.SELECTED == arg0.getStateChange()){
          String selectedItem = arg0.getItem().toString();
          label.setFont(new Font(selectedItem, Font.PLAIN, FONTSIZE));
          System.out.printf("new selected item : %s%n",selectedItem);
        }
        if(ItemEvent.DESELECTED == arg0.getStateChange()){
          String selectedItem = arg0.getItem().toString();
          System.out.printf("deselected item : %s%n",selectedItem);
        }
      }
      };
      
    //���һ��JComboBox
    faceCombo = new JComboBox<String>();
    faceCombo.setEditable(true);
    faceCombo.addActionListener(actionListener);
    faceCombo.addPopupMenuListener(popupMenuListener);
    faceCombo.addItemListener(itemListener);
    faceCombo.setEnabled(true);
    faceCombo.addItem("Serif");
    faceCombo.addItem("SansSerif");
    faceCombo.addItem("Monospaced");
    faceCombo.addItem("Dialog");
    faceCombo.addItem("DialogInput");
    add(faceCombo, BorderLayout.CENTER);
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //�������岢ָ������
    JComboBoxBasicUseDemo frame = new JComboBoxBasicUseDemo();
    //�رմ�����˳�����
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //�Զ��������пؼ���С
    //frame.pack();
    //���ô���λ������Ļ����
    frame.setLocationRelativeTo(null);
    //��ʾ����
    frame.setVisible(true);
  }
}