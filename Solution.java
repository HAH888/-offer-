
import java.util.Scanner;

public class Solution {
		private int target;
		
		public int getTarget() {
			return target;
		}

		public void setTarget(int target) {
			this.target = target;
		}

		/*
		 * �����½�Ԫ�����ϲ��ң��ұ�Ԫ���Ǳ����Ԫ�ش��ϱ��ǵ�Ԫ�ر����Ԫ��С��
		 * ���ǣ�target�����Ԫ��С�������ң������Ԫ�ش�������ҡ�������˱߽磬��˵����ά�����в�����targetԪ�ء�
		*/
		public boolean Find(int target, int [][] array) {
	         int rows = array.length;
	         int cols = array[0].length;
	         int i=rows-1,j=0;
	        while(i>=0 && j<cols){
	            if(target>array[i][j])
	                j++;
	            else if(target<array[i][j])
	                i--;
	            else
	                return true;    
	        }
	        return false;
	    }
		
		public int[][] creatMatrix(int m,int n){
			Scanner in = new Scanner(System.in);
			int array[][]=new int[m][n];
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=in.nextInt();				
				}
			}
			return array;
		}
		
		public void outMatrix(int[][] t){
			for(int i=0;i<t.length;i++) {
				for(int j=0;j<t[i].length;j++) {
					System.out.print(t[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
	
}
