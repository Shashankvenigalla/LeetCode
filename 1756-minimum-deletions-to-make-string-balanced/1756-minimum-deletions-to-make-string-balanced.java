class Solution {
    public int minimumDeletions(String s) {
        Stack<Character>stk=new Stack<>();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                if(!stk.isEmpty() && stk.peek()!='b'){
                    stk.push(ch);
                }
                else{
                    if(!stk.isEmpty()){
                        stk.pop();
                        cnt++;
                    }
                }
            }
            else if(ch=='b'){
                stk.push(ch);
            }
        }
        return cnt;
    }
}