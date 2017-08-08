package Codehers;
import java.awt.*;
import java.sql.*;
import java.lang.*;
import java.io.*;
import java.util.*;


public class buildings {

	public static void main(String args[]) {
		int T,n,i;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		while(T--!=0){
			n=sc.nextInt();
			int [] arr=new int[n];
			int count=0;
			int max=Integer.MIN_VALUE;
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(arr[i]>max){
					count++;
					max=arr[i];
				}
				}
			System.out.println(count);
			
					
		}
		
	}
  }
 


