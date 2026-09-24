import java.util.*;
class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int g=numsDivide[0];
        for(int i=1; i<numsDivide.length;i++){
            g=gcd(g,numsDivide[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(g % nums[i]==0){
                return i;
            }
        }return -1;
    }
    private int gcd(int a , int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}