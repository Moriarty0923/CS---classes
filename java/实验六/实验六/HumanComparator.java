package ʵ����;
import java.util.Comparator;

//�����Զ���������HuamnComparator��ʵ���Զ�������
public class HumanComparator implements Comparator<HumanInfo> {

	
	public int compare(HumanInfo h1, HumanInfo h2) {
		//�Ƚ�����ǰ׺��
        return h1.getemail().split("@")[0].compareTo(h2.getemail().split("@")[0]);
    }
}
