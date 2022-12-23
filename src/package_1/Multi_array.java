package package_1;

import java.util.Arrays;

public class Multi_array {

	public static void main(String[] args) {
		
		// 1st way of declaration
		int [][]x = new int [2][2];
		
		x[0][0] = 20;
        x[0][1] = 30;
        x[1][0] = 40;
        x[1][1] = 50;
        
       System.out.println(Arrays.deepToString(x));
       
       // 2nd way of declaration
       int[][]y = new int [][] {{100,200,300},{400,500,600}};
       
       System.out.println(Arrays.deepToString(y));
       
      
	}

}
