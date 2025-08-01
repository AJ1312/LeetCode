class Solution {
public:
    int fib(int n) {
        int a =0;
        int x =0;
        int y=1;
        if(n==0 || n==1){
            return n;
        }
       
        for(int i=1; i<n;++i){
            a = x+y;
            x=y;
            y=a;
        }
        return a;
        
    }
};