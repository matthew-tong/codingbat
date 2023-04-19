/**
 * 
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */
public boolean lucky13(int[] nums) {
    int ones = 0;
    int threes = 0;
    for(int i : nums){
      if(i == 1 || i == 3){
        return false;
      }
    }
    return true;
  }
  