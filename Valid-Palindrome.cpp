class Solution {
public:
    bool isPalindrome(string s) {
        string f;
        for(char c: s){
        if(isalnum(c)){
            f += tolower(c);
        }
    }  

    for(int i=0;i<f.length()/2;i++){
        if(f[f.length()-i-1]!=f[i]){
            return false;
        }
    }
    return true;
    }   
};