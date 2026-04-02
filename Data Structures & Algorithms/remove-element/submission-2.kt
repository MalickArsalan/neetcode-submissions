class Solution {
    fun removeElementMy(nums: IntArray, `val`: Int): Int {
        var l = 0

        for (r in 0 until nums.size){
            if(nums[r] != `val`)
            {
                nums[l] = nums[r]
                l+=1
            }
        
        
        }
        return l

    }
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var n = nums.size
        while(i < n){
            if (nums[i] == `val`){
                n--
                nums[i] = nums[n]
            }
            else{
                i++
            }
        }
        return n
    }
}
