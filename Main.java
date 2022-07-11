package com.greatlearning.iitr.dsa.labsession2q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the size of the currency in Denomination value:");
	    n = s.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter all the elements:");
	    for (int i = 0; i < n; i++) 
	    {
	        a[i] = s.nextInt();
	    }
	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = i + 1; j < n; j++) 
	        {
	            if (a[i] < a[j]) 
	            {
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    //System.out.print("Descending Order:");
	    System.out.println("enter the amount to be paid");

		int amount = s.nextInt();

		
		
		sort(a, 0, a.length-1);
		Object notesCount;
		
		NotesCount.notesCountImplementation(a, amount);
}

	private static void sort(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		
	}

		
	}

