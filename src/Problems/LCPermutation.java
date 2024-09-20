package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCPermutation {

	static int counter = 0;
	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         System.out.println("counter"+ counter);
		         System.err.println(tempList);
		         System.err.println(Arrays.toString(nums));
		         counter++;
		         backtrack(list, tempList, nums);
		         System.err.println("counter" + counter + "post "+tempList);
		         tempList.remove(tempList.size() - 1);
		         System.err.println("counter" + counter + "post "+tempList);
		      }
		   }
		} 

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3};
		List<List<Integer>> list = new ArrayList<>();
			
		// Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<>(), nums);
		   
		   System.out.println("combination" + list);
	}
	
	static List<Integer> getReturn(Integer[] arr, int a, int b) {
		List<Integer> temp = new ArrayList<Integer>();
		for(int i=a; i<=b; i++) {
			temp.add(arr[i]);
		}
		
		return temp;
	}

}
