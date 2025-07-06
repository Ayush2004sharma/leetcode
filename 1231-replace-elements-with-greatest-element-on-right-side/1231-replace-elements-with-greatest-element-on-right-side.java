class Solution {
    public int[] replaceElements(int[] arr) {
        int result[]= new int [arr.length];
        int max =arr[arr.length-1];
        for(int i =arr.length-1;i>=0;i--){
            result[i]=max;
           if(arr[i]>max)max=arr[i];
            

        }
        result[arr.length-1]=-1;
        return result;
    }
}