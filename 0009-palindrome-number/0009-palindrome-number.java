class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int result=0;
        int x1=x;
        while(x1>0){
        int temp=x1%10;
        result=result*10+temp;
        x1=x1/10;
        }
        if(x==result){
            return true;
        }
        return false;

        
    }
}