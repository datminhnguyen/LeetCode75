import java.util.*;

public class Solution {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		List<Boolean> result = new ArrayList<Boolean>();
		int max = candies[0];
		
		for(int i = 1; i < candies.length; i++) {
			if(max < candies[i]) {
				max = candies[i];
			}
		}
		
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] + extraCandies >= max) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		
		return result;
	}
}

//The logic here is finding the max value in the array
//then compare that maximum with the sum of each value in the array and the extra number
