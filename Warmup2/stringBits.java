/**
 * 
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public String stringBits(String str) {
    String temp = "";
    if(str.equals("")){
      return "";
    }
    if(str.length() < 2){
      return str.substring(0, 1);
    }
    for(int i = 0; i < str.length(); i+=2){
      temp += str.substring(i, i+1);
    }
    
    return temp;
  }
  