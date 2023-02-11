/**
 * 
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public String stringTimes(String str, int n) {
    String stringTimes = "";
    
    for(int i = 0; i < n; i++){
      stringTimes += str;
    }
    
    return stringTimes;
  }
  