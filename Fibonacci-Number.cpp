class Solution {
public:
    int fib(int n) {
        int a =0;
        int x =0;
        int y=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(int i=1; i<n;++i){
            a = x+y;
            x=y;
            y=a;
        }
        return a;
        
    }
};