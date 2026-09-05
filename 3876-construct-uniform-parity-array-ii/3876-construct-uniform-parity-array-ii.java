class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;
        boolean hasEven = false;
        
        // Step 1: Find the smallest odd number and check what exists
        
        for (int num : nums1) {
            if (num % 2 != 0) {
                hasOdd = true;
                minOdd = Math.min(minOdd, num);
            } else {
                hasEven = true;
            }
        }
        
        // Case 1: Can we make everything Even?
        // Only if there are NO odd numbers

        boolean canMakeEven = !hasOdd;
        
        // Case 2: Can we make everything Odd?

        boolean canMakeOdd = true;
        if (hasEven) {
            if (!hasOdd) {
                canMakeOdd = false;
            } else {
                // Check if the smallest odd is smaller than every even number

                for (int num : nums1) {
                    if (num % 2 == 0 && num <= minOdd) {
                        canMakeOdd = false;
                        break;
                    }
                }
            }
        }
        
        return canMakeEven || canMakeOdd;
    }
}