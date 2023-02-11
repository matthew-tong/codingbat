/**
 * 
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public String stringX(String str) {
    String stringX = "";
    for(int i = 0; i < str.length(); i++){
      if(!(i > 0 && i < (str.length()-1) && str.substring(i, i + 1).equals("x"))){
        stringX += str.substring(i, i + 1);
      }
    }
    return stringX;
  }
  