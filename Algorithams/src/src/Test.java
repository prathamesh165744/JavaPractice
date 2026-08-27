package src;
import src.Search;

public class Test {
	
	public static void main(String args[]) {
		
		Search ls= new Search();
		int ans =ls.LinerSearch(new int[]{2,3,5,7,89,23,6},89);
		System.out.println(ans);
		
		
		int ans2 =ls.BinerySearch(new int[]{2,3,5,7,89},89);
		System.out.println(ans2);
	}

	

}
