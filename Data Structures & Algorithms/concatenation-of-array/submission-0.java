class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=0,j=0;
        int[] ans=new int[2*(nums.length)];
        while(j<2){
            for(int k=0;k<nums.length;k++){
                ans[i]=nums[k];
                i++;
            };
            j++;
    }
    return ans;
}
}