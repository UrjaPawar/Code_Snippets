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
			
			Queue<Integer> odd_indexes=new LinkedList<>();
			int idx=0,last_index=0;
			int [] arr=new int[n];
			int temp=0;
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(arr[i]%2!=0){
					System.out.println("1: "+arr[i]);
					odd_indexes.add(i);
				}
				else{
					System.out.println("2: "+arr[i]);
					if(!odd_indexes.isEmpty()){
						
						idx=odd_indexes.remove();
						if(last_index<idx){
							temp=arr[last_index+1];
							System.out.println("4: "+arr[i]);
							arr[last_index+1]=arr[i];
							arr[i]=temp;
							last_index=last_index+1;
						}
						else{
						System.out.println("3: "+arr[idx] + "Swap "+arr[i]);
						temp=arr[idx];
						arr[idx]=arr[i];
						arr[i]=temp;
						last_index=idx;
						
					}
					
						
					}
					
					
					
					
				}
				}
		
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
			}		
		}
		
	}
  }
 


