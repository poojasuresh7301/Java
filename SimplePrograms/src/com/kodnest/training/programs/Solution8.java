package com.kodnest.training.programs;
import java.util.Scanner;
public class Solution8 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 for(int i=1;i<=n;i++) {
		 if(i%5==0 && i%2!=0 ) {
			 System.out.println(i);
		 }
	 }

	}

}
