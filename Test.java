import java.util.*;

public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner in = new Scanner(System.in);
		int m=in.nextInt();//��
		int n=in.nextInt();//��
		int array[][]=s.creatMatrix(m, n);
		s.setTarget(4);
		boolean t=s.Find(s.getTarget(), array);
		s.outMatrix(array);
		if(t == true)
			System.out.println("�ҵ���");
		else
			System.out.println("û�ҵ�");
		
	}

}
