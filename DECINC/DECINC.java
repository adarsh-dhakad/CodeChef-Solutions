package DECINC;

import java.util.Scanner;

public class DECINC {

		public static void main (String[] args) throws java.lang.Exception
			{
			    try{
				Scanner sc = new Scanner(System.in);
				
				int num = sc.nextInt();
				if(num%4==0){
				  num++;  
				System.out.println(num);
				}else{
				    num--;
				    	System.out.println(num);
				}
				
			    }catch(Exception e){}
			}
		}