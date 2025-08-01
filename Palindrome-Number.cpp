class Solution {
public:
    bool isPalindrome(int x) {
        long y = x;
        long r=0;
        while(x!=0){
            int a= x%10;
            r= r*10+a;
            x/=10;
        }
        
        if(y<0){
            return false;
        }else{
            if(r==y){
                
            }
        }
        return r==y;

        
    }
};