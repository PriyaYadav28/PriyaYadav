package com.priya.task;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number : ");
		int n =s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Element: ");
		for(int i=0;i<n;i++) {
			
			arr[i] = s.nextInt();
		}
		System.out.println("Enter no. of testcase : ");
		int test = s.nextInt();
		for(int j=0;j< test; j++) {
			System.out.println("Enter Element : ");
			int num = s.nextInt();
			int count = 0;
			for(int i=0;i<n;i++) {
				if(num== arr[i])
					count++;
			}
			if(count ==0)
			 System.out.println("Not Present");
			else
				System.out.println("Occurrence : "+ count);
		}
	}

}
