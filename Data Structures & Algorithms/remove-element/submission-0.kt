class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var l = 0

        for (r in 0 until nums.size){
            if(nums[r] != `val`)
            {
                nums[l] = nums[r]
                l++
            }
        
        
        }
        return l

    }
}
