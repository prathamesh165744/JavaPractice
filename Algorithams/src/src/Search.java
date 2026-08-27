package src;

public class Search {
	
	public static int LinerSearch(int array[],int t){
		
		int ans=-1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==t) {
				ans =i;
			}
			
		}
		return ans;
	}
	
	
	
	///Bineary serach is more optimize then liner search in this search we can with minimum computation find out the output ulike the liner search
	
	
	public static int BinerySearch(int array[],int t){
		int s=0;
		int e=array.length-1;
	
		int ans=-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(array[m]==t) {
				ans=m;
				break;
			}
			else if(array[m]<t) {
				s=m+1;
			}else {
				e=m-1;
			}
		}
		return ans;
	}

}
