package package_1;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int[] a = new int [5];         
		
		a[0] = 10;            //1st way to store value in array
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int []b = new int [] {10,20,30, 40, 50,60};    //2nd way
		
		System.out.println(a.length);                 //to know length of array
		System.out.println(b.length);
		
		for(int i =0; i<=4; i++)                      //1st way to retrieve data
		{
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));        //2nd way to retrieve 
		System.out.println(Arrays.toString(b));
		
	}

}

