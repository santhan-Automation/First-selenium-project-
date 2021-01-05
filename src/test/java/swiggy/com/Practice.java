package swiggy.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Practice {

	public void whileloop() {
		ArrayList list =new ArrayList();
		list.add("santhan");
		list.add("DOB");
		list.add(25);
		list.add(12);
		list.add(1995);
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
				System.out.print(itr.hasNext()+" ");
				System.out.println(list.size());
				}
	}
	
	public static void dowhileloop() {
		ArrayList list =new ArrayList();
		list.add("santhan");
		list.add("DOB");
		list.add(25);
		list.add(12);
		list.add(1995);
		int i =list.size();
		do {
			
			System.out.println(i);
			i++;
		}
		while(i < 10);
		
	}
	public static void matrix () {

		int[][] Int =new int [3][3];
		Int[0][0] =0;
		Int[0][1] =0;
		Int[0][2] =1;
		Int[1][0] =1;
		Int[1][1] =0;
		Int[1][2] =0;
		Int[2][0] =0;
		Int[2][1] =1;
		Int[2][2] =0;
		System.out.println(Arrays.toString(Int[0]));
		System.out.println(Arrays.toString(Int[1]));
		System.out.println(Arrays.toString(Int[2]));
		/*for(int[] matrix : Int) {
			System.out.println(matrix.);
		}*/
		
	}
	public static void stars() {
	/* 
	    *
		**
		***
		****
		***** 
		****
		***
		**
		*
		  */
		
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Please enter the size :");
		int size =sc.nextInt();
		for (i=1 ;i<=size ;i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");	
			}
			System.out.println();
			
		}
		
		for(i=size-1;i>=1;i--) {
		 for (int j = 1; j <=i ; j++) {
			  System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void stars2() {
		/* 
     *
    **
   ***
  ****
 *****
 *****
  ****
   ***
    **
     *
	 
	 */
			
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Please enter the size :");
		int size =sc.nextInt();
			for (i=1 ;i<=size ;i++) {
				for (int j =size; j >=i ; j--) {
					System.out.print(" ");	
				}
				for(int k=1 ;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			for (i=size ;i>=1 ;i--) {
				for (int j =size; j >=i ; j--) {
					System.out.print(" ");	
				}
				for(int k=1 ;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			
		}
	
	public static void stars3() {
	/*	 *
	    ****
	   ******
	  ********
	 **********
	 **********
	  ********
	   ******
	    ****
	     *
			*/
		Scanner sc =new Scanner(System.in);
			int i;
			System.out.println("Please enter the size :");
			int size =sc.nextInt();
			for (i=1 ;i<=size ;i++) {
				for (int j =size; j >=i ; j--) {
					System.out.print(" ");	
				}
				for(int k=1 ;k<=i;k++) {
					if(i==1) {
						System.out.print("*");
					}else {
					System.out.print("**");
					}
				}
				System.out.println();
				
			}
			for (i=size-1 ;i>=1 ;i--) {
				for (int j =size; j >=i ; j--) {
					System.out.print(" ");	
				}
				for(int k=1 ;k<=i;k++) {
					if(i==1) {
						System.out.print("*");
					}else {
					System.out.print("**");
					}
				}
				System.out.println();
				
			}
			
			/*for(i=4;i>=1;i--) {
			 for (int j = 1; j <=i ; j++) {
				  System.out.print("*");
				}
				System.out.println();
			}
			*/
		}
	public static void main(String[] args) {
		//dowhileloop();
		//matrix();
		stars();
		stars2();
		System.out.println();
		stars3();
	}

}
