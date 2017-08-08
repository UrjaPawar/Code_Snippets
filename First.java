package Codehers;
import java.awt.*;
import java.sql.*;
import java.lang.*;
import java.io.*;
import java.util.*;


public class First {

	public static void main(String args[]) {
		int T,n,i,j,x;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		int incl=0,excl=0,temp,max;
		while(T--!=0){
			n=sc.nextInt();
			int [] arr=new int[n];
			
			boolean flag=false;
			arr[0]=sc.nextInt();
			incl=arr[0];
			excl=0;
			for(i=1;i<n;i++){
				arr[i]=sc.nextInt();
				temp=incl;
				if(incl<excl+arr[i]){
					incl=excl+arr[i];
				}
				excl=Math.max(temp, excl);			}
			max=((incl > excl) ? incl : excl);
			System.out.println(max);
					
		}
		
	}
  }
 


