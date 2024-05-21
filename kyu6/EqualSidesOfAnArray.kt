package kyu6

/**
 * You are going to be given an array of integers.
 * Your job is to take that array and find an index N where the sum of the integers
 * to the left of N is equal to the sum of the integers to the right of N.
 *
 * If there is no index that would make this happen, return -1.
 */

object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        var leftSum = 0
        var rightSum: Int
        for (i in arr.indices) {
            if (i > 0) leftSum += arr[i - 1]
            rightSum = 0
            for (j in i + 1 until arr.size) {
                rightSum += arr[j]
            }
            if (leftSum == rightSum) {
                return i
            }
        }
        return -1
    }
}
