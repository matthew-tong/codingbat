/**
 * 
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public boolean in3050(int a, int b) {
    boolean ar1 = 30 <= a && a <= 40;
     boolean ar2 = 40 <= a && a <= 50;
     boolean br1 = 30 <= b && b <= 40;
     boolean br2 = 40 <= b && b <= 50;
           
     return ar1 && br1 || ar2 && br2;
 }
 