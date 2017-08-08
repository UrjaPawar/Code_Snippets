package Codehers;
import java.awt.*;
import java.sql.*;
import java.lang.*;
import java.io.*;
import java.util.*;


public class Type2 {

	public static void main(String args[]) {
		int T,n,i,j,x;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		int incl=0,excl=0,temp,max;
		while(T--!=0){
			n=sc.nextInt();
			int [][] arr=new int[2][n];
			
			
			excl=0;
			for(i=0;i<n;i++){
				arr[0][i]=sc.nextInt();}
			for(i=0;i<n;i++){
				arr[1][i]=sc.nextInt();
			}
			incl=Math.max(arr[0][0], arr[1][0]);
			for(i=0;i<n;i++){						
			temp=incl;
				if(incl<excl+Math.max(arr[0][i], arr[1][i])){
					incl=excl+Math.max(arr[0][i], arr[1][i]);
				}
				excl=Math.max(temp, excl);			}
			max=((incl > excl) ? incl : excl);
			System.out.println(max);
					
		}
		
	}
  }
 


