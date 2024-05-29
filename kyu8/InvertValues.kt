package kyu8

/**
 * Given a set of numbers, return the additive inverse of each.
 * Each positive becomes negatives, and the negatives become positives.
 * [1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
 * [1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
 * [] --> []
 */
fun invert(arr: IntArray) = arr.map { -it }.toIntArray()

