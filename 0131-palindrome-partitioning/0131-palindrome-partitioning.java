class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res = new ArrayList<>();
        List<String>path= new ArrayList<>();
        func(s,0,path,res);
        return res;
        }

      public void func(String s , int ind,List<String>path,List<List<String>>res){
        if(ind==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i =ind;i<s.length();++i){
            if(palindrome(s,ind,i)){
                path.add(s.substring(ind,i+1));
                func(s,i+1,path,res);
                path.remove(path.size()-1);
            }
        }
      }  
  public boolean palindrome(String s, int s1, int e) {
    while (s1 < e) {
        if (s.charAt(s1++) != s.charAt(e--)) return false;
    }
    return true;
}

}