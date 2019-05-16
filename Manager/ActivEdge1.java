package com.Manager;

import java.util.*;

public class ActivEdge1 {
	static int smallestNumber(int []arr){
		Arrays.sort(arr);     
        int small = 1; 
            int num = arr.length;
        for (int i = 0; i < num; i++){
            if(arr[i] == small){
                small++;
            }
        }   
        return small;    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,6,4,1,2};
		int b[] = {5,-1,-3};
		System.out.println("Smallest Non occur: " + smallestNumber(a));
		System.out.println("Smallest Non occur: " + smallestNumber(b));
	}

}
