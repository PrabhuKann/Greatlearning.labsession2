package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;
class PayMoney {
public static void main(String[] args)  {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of transaction array");
	int n=s.nextInt();// decides number of elements in array
	int arr[]=new int[n]; 

	System.out.println("Enter the values of array");

    for(int i=0;i<n;i++){//for reading array
        arr[i]=s.nextInt();
    }
    System.out.println("Value of array is :");
    for(int j: arr){ //for printing array
	System.out.print(j+" ");
      }
    System.out.println("\n");
    
    int ttl = 0; // to find the total value of arrays

	for (int j = 0; j < arr.length; j++) {
	ttl += arr[j];
	}
	
	
	

    System.out.println("Enter the total no of targets that needs to be achieved");
    
    int target=s.nextInt();
    int k;
    int q = target + 1;
    for (k = 1; k < q; k++) {
    	
    	
    	System.out.println("\nEnter the target value");
    	int targetvalue=s.nextInt();
    	// code for target not acchieved
if (targetvalue > ttl) {
	System.out.println("Target cannot be acheived");
	}
    // code for required result
else { 
int total = 0;
    	int counter = 0;
        	
    	     for (int j = 0; j < arr.length; j++) {
               	total += arr[j];
               	counter = counter +1;
               	if (total >= targetvalue) {
               		System.out.println("Target achieved after " + counter + " tranactions");
    	    		break;	
     }
    }
   }
  }			    	
 }
}

    	



