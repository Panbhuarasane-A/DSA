class Solution {
    public void reverseString(char[] s) {
         int low = 0,high = s.length-1;
        int mid = (low+high)/2;
        for(int i=0;i<=mid;i++){
            char temp = s[i];
            s[i]=s[high-i];
            s[high-i]=temp;
        }
    }
}
