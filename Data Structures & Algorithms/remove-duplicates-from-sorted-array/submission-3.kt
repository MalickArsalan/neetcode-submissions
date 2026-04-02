class Solution {
    fun removeDuplicates(nums: IntArray): Int {

        if (nums.size == 0) return 0

        val result: MutableSet<Int> = mutableSetOf<Int>()

        for (index in 0 until nums.size){
            if(!result.contains(nums[index])){
                result.add(nums[index]) 
            }
        }
        

        var i = 0
        for (value in result) {
            nums[i++] = value
        }

        print(nums.contentToString())

        return result.size   

    }
}
