package leetcode1431;

import java.util.*;

/*LeetCode - 1431 : Kids With the Greatest Number of Candies*/

public class Leetcode1431Solution {

	public static void main(String[] args) {

		int[] candies = new int[] {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> output = kidsWithCandies(candies,extraCandies);   
		output.stream().forEach(val->System.out.println(val));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {  
		//Initialize output list
		List<Boolean> output = new ArrayList<>();    

		try {
			// Initialize maximum element 
			int max = candies[0];          													  
			// Traverse array element to find the highest number  
			for (int i = 1; i < candies.length; i++) 
				if (candies[i] > max) 
					max = candies[i];         				  

			//Loop through each element to set output[i] to true or false, depending on the sum of candies[i] and extraCandies
			for(int i =0; i<candies.length; i++){
				if(candies[i]+extraCandies < max){
					output.add(false);
				}else{
					output.add(true);
				}
			}        

		} catch (Exception e) {
			e.printStackTrace();
		}

		//finally, return the output list
		return output;
	}
}
