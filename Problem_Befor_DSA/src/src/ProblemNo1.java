package src;

public class ProblemNo1 {
	
	// we want here to print  count of how many time this array get addition as 12 
	
	public static void main(String args[]) {
		int sum=0;
		int count=0;
		
		int array[]= {1,2,3,7,5};
		for (int i = 0; i < array.length; i++) {
			sum=0;
			for (int j = i; j < array.length; j++) {
				sum=sum+array[j];
				if(sum==12) {
					count++;
				}
				
			}
		}
		System.out.println(count);
		
	}

}
