import java.math.BigInteger;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
			int len1 = str1.length();
		  int len2 = str2.length();
		  BigInteger frstlen = BigInteger.valueOf(len1);
		  BigInteger scndlen = BigInteger.valueOf(len2);
		  boolean check = true;
		  String concat = str1 + str2;
		  int i = 0;
		  int j = 0;
		
		  BigInteger gcd = frstlen.gcd(scndlen);
		  int value = gcd.intValue();
		
		  if(value == 0) {
			  return "";
		  }else {
			  int count = concat.length()/value;
			  while(i < count && check == true) {
				  if(concat.substring(0, value).equals(concat.substring(j, j+value))) {
					  check=true; 
				  }else {
					  check = false;
				  }
				  i+=1;
				  j+=value;
			  }
		  }

		  if(check == false) {
			  return "";
		  }else{
			  return str1.substring(0, value);
		  }
	  }
	
}

//First find the greatest common divisor of two lengths of str1 and str2
//then check if the substring with the length of the gcd is the greatest common divisor of both 2 strings
