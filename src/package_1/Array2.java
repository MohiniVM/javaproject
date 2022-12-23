package package_1;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	
		int [][]x = new int [4][4];
		
		x[0][0] = 20;
		x[0][1] = 30;
		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]+ " \t ");
			}
			System.out.println();
		}
		System.out.println(x.length);
		
		System.out.println(Arrays.deepToString(x));
	}		

}
