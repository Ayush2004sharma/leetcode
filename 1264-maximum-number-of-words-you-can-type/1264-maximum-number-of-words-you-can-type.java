class Solution {
   public int canBeTypedWords(String text, String brokenLetters) {
    int count = 0;
    Set<Character> broken = new HashSet<>();
    
    for (char c : brokenLetters.toCharArray()) {
        broken.add(c);
    }
    
    String[] arr = text.split(" ");
    for (String s : arr) {
        boolean canType = true;
        
        for (char c : s.toCharArray()) {
            if (broken.contains(c)) {
                canType = false;
                break;
            }
        }
        
        if (canType) count++;
    }
    
    return count;
}

}