class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = word1.length()+word2.length();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while(i < word1.length() || i < word2.length()){
            if(i<word1.length()){
                result.append(word1.charAt(i));
            }
            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

//The point is to add altenately characters in word1 and word2
//We create an empty String by StringBuilder to easily add characters from word1 and word2
//Use loop to traverse through each word, until the end of the longer word.
