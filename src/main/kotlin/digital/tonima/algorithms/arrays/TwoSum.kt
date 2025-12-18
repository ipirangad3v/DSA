package digital.tonima.algorithms.arrays

class Solution {
    // Time: O(n), Space: O(n) - single pass through array with HashMap lookup O(1)
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        // Map structure: Key = Number (Value), Value = Index
        // We name it 'seenNumbers' to indicate it holds the history of what we traversed.
        val seenNumbers = HashMap<Int, Int>()

        for (currentIndex in nums.indices) {
            val currentNumber = nums[currentIndex]
            val neededComplement = target - currentNumber

            // Check if the complement (the number we need) exists in the history
            if (seenNumbers.containsKey(neededComplement)) {
                val complementIndex = seenNumbers[neededComplement]!!

                // Return: [Index of the number found previously, Current Index]
                return intArrayOf(complementIndex, currentIndex)
            }

            // Store: Current Number (Key) -> Current Index (Value)
            seenNumbers[currentNumber] = currentIndex
        }

        return null
    }
}

