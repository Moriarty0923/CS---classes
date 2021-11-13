package 实验六;
import java.util.Comparator;

//创建自定义排序器HuamnComparator来实现自定义排序
public class HumanComparator implements Comparator<HumanInfo> {

	
	public int compare(HumanInfo h1, HumanInfo h2) {
		//比较邮箱前缀串
        return h1.getemail().split("@")[0].compareTo(h2.getemail().split("@")[0]);
    }
}
