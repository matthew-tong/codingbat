/**
 * 
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public boolean more14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for(int i : nums){
      if(i == 1){
        ones++;
      }
      if(i == 4){
        fours++;
      }
    }
    if(ones > fours){
      return true;
    }
    return false;
  }
  