//Approach*******************************
// 1. initialize res =0 (32 bits)
// 2. iterate 32 bits: 
//         while loop i<32
// 3. Left shift: res :
//         res <<1
// 4. if (n&1 == 1 ): 
//          res = res+1
// 5. Right shift n :
//         n>>1


public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res =0; //00000 .... 32 bits
        int i=0;
        while(i<32){
            res= res <<1; //left shift the result
            res = res | (n&1);
            // if((n&1)==1){
            //     result++;
            // }
            n = n>>1; //right shift 1 
            i++;
        }
        return res;
    }
}




********************************************************************
 // https://www.notion.so/Reverse-Bits-LeetCode-d63be929a07a488a8e0100bd0500b5c5?pvs=4
