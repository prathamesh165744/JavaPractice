package src;

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
	
	public static void main(String args[]) {
		
		int result =SumCount(new int[]{1,2,3,7,5});
		
		System.out.println(result);
		
		
	}

}
