//aproach:**********************
// One step solution
// And operation:
// (n &n-1 ==0)


class Solution {
    public boolean isPowerOfTwo(int n) {
        //pracrice : 17/04

        //using binary
        //base case
        if(n<1){return false;}
        int x = n&n-1;
        //4=0100 & 1011 == 0000
        return x ==0;
    }
}
**************************

  //approach 2:
//   n = num given 
// x = power of

// while(n>1){
// if(n%x≠0){return false;}
// n=n/x;
// }

  class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        while (n>1){
            if(n%2!=0) {
                return false;
            }
            n=n/2;
        }
        return true;
    }
}

*************************
  //https://www.notion.so/Power-Of-Two-LeetCode-9200ad871ddf492381f9db2b4e6b363f?pvs=4
