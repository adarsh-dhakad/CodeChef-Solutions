package DIFFSUM;

import java.util.Scanner;

public class DIFFSUM {

	public static void main(String[] args) {
		int N1=0,N2=0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
	              N1=sc.nextInt(); 
		     	  N2=sc.nextInt();// if there is another number  
		     	  
		     	   if(N1>N2) {
		   			System.out.println(N1-N2);
		   		}else {
		   			System.out.println(N1+N2);
		   		}
		   		
		}
				
		sc.close();	
	
	}

}
