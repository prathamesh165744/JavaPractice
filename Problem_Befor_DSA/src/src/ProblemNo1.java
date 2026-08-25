package src;

import java.util.Arrays;
import java.util.Iterator;

public class ProblemNo1 {
	
	// we want here to print  count of how many time this array get addition as 12 
	
	static int SumCount(int array[]) {
		int sum=0;
		int count=0;
		
		for (int i = 0; i < array.length; i++) {
			sum=0;
			for (int j = i; j < array.length; j++) {
				sum=sum+array[j];
				if(sum==12) {
					count++;
				}
				
			}
		}
		return count;
		
	
	}
	
	//finding max from the array
	static int FMax(int array[]) {
		
		int max=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max=array[i];
			}
			
		}
		return max;
		
	}
	
	//finding second max from the array 
	
	static String SecondMax(int array[]) {
		
		int max=array[0];
		int second=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				second=max;
				max=array[i];
			}
			else if (array[i] > second && array[i] != max) {
				second=array[i];
			}
			
		}
		return max+" "+second;
	}
	
	//finding is array sort or not 
	static boolean IsSort (int array[]) {
		boolean isSort=true;
		for (int i = 0; i < array.length-1; i++) {
			
			if (array[i]>array[i+1]) {
				isSort=false;
			}
			
		}
		return isSort;
	}
	static int [] revArray(int array[]) {
		int rev[]=new int[array.length];
		int j=0;
		
		//there are three type we can reverse the array 
		//no1
//		for (int i = array.length-1; i >=0; i--) {
//			rev[j]=array[i];
//			j++;
//		}
		//no2
		//for (int i = array.length-1; i >=0; i--) {
		//syso(array[i]);
		
		//no3
		//this is called two pointer
	
			int start =0; int end =array.length-1;
			while(start<end) {
				int temp=array[start];
				array[start]=array[end];
				array[end]=temp;
				start++;
				end--;
			}
		return array;
	}
	
	static int [] leftShift(int array[]){
		int temp=array[0];
	 for (int i = 1; i < array.length; i++) {
		array[i-1]=array[i];
	 }
	 array[array.length-1]=temp;
		return array;
	}
	
	static int [] rightShift(int array[]){
		int temp=array[array.length-1];
	 for (int i =  array.length-2; i >=0; i--) {
		array[i+1]=array[i];
	 }
	 array[0]=temp;
		return array;
	}
	
	static int [] leftShiftByK(int array[],int k){
		int n =array.length;
		k=k%n;// this line lots of improving the optimization
		for (int j = 0; j< k; j++) {
			
		
		int temp=array[0];
		 for (int i = 1; i < array.length; i++) {
			array[i-1]=array[i];
		 }
		 array[array.length-1]=temp;
			
		}
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		int result =SumCount(new int[]{1,2,3,7,5});
		
		System.out.println(result);
		
		
	int max =FMax(new int[]{1,2,3,7,5});
		
		System.out.println(max);
		
String sm =SecondMax(new int[]{1,2,3,7,5});
		
		System.out.println(sm);
		
		
boolean issort =IsSort(new int[]{1,2,3,7,5});
		
		System.out.println("is array sort "+issort);
		
		int [] rev=revArray(new int[]{1,2,3,7,5});
		
		System.out.println(Arrays.toString(rev)); 
		
		int []ls =leftShift(new int[] {3,5,7,4,7,9});
		System.out.println(Arrays.toString(ls)); 
		
		int []lsk =leftShiftByK(new int[] {3,5,7,4,7,9},2);
		System.out.println(Arrays.toString(lsk)+"this is left shift by k times");
		
		int []rs =rightShift(new int[] {3,5,7,4,7,9});
		System.out.println(Arrays.toString(rs)); 
		
	
		
	}

}
