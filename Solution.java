
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
		 * 从左下角元素往上查找，右边元素是比这个元素大，上边是的元素比这个元素小。
		 * 于是，target比这个元素小就往上找，比这个元素大就往右找。如果出了边界，则说明二维数组中不存在target元素。
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
