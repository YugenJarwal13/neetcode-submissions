class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefixProd = new int[nums.length];
        int [] ans = new int[nums.length];
        int pre = nums[0];
        prefixProd[0] = pre;
        for(int i=1; i<nums.length; i++){
            prefixProd[i] = pre*nums[i];
            pre = prefixProd[i];
        }
        int suffix = 1;
        for(int i=nums.length-1; i>=0; i--){
            int leftProduct;
            if(i==0) leftProduct=1;
            else{
                leftProduct=prefixProd[i-1];
            }
            ans[i] = suffix*leftProduct;
            suffix*=nums[i];
        }
        return ans;
    }
}  
