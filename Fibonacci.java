package com.atandt;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many Fibonacci Series # do you want?");
			int n = sc.nextInt();
			int a,b,c;
			a=0;
			b=1;
			int flag = 1;
			System.out.print("Fibonacci Series:");
			while(flag<=n)
			{
			System.out.print(a+", ");
			c=a+b;
			a=b;
			b=c;
			flag++;
			}
		}
		

	}

}
