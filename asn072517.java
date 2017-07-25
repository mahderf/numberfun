package MyFirstPackage;

import java.io.*;
import java.util.*;


public class asn072517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Response = "y";
		System.out.println("Would you like to continue?");
	
		while ( Response.equalsIgnoreCase("y"))

		{
		Scanner scan = new Scanner (System.in);
		 Response=scan.next();
		
		
		
			if(Response.equalsIgnoreCase("y"))
			{
				System.out.println("Would you like to continue?");
				Response=scan.next();
			}
	      if (Response.equalsIgnoreCase("n"))
	    	  
	      { 
	    	  System.out.println("error");
	      }
	
	

		}
	}
}


