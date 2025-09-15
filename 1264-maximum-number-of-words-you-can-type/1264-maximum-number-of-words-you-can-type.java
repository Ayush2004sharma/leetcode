class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
       String arr[]= text.split(" ");
       for( String s :arr){
        int temp =0;
        for( int i =0;i<brokenLetters.length();i++){
            if(s.indexOf(brokenLetters.charAt(i)) != -1){
                temp++;
            }
        }
        if(temp==0)count++;
       } 
       return count;
    }
}