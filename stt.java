class stt {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        if(nums.length == 1) return 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < nums[i+1]){
                count++;
            }{
                break;
            }
        }
        return count;
    }
}