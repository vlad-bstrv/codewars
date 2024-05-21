/**
 * Your task is to find the next higher number (int) with same '1'- Bits.
 *
 * I.e. as much 1 bits as before and output next higher than input.
 * Input is always an int in between 1 and 1<<30 (inclusive).
 * No bad cases or special tricks...
 */

fun nextHigher(n: Int): Int {
    var startNumber = n
    val countBinary = countBinary(n)

    while (true) {
        val nextNumber = ++startNumber
        if(countBinary == (countBinary(nextNumber))) {
            return nextNumber
        }
    }
}

fun countBinary(number: Int): Int {
    var countBinary = 0
    numberToBinaryString(number).forEach {
        if (it == '1') {
            countBinary++
        }
    }
    return countBinary
}

fun numberToBinaryString(number: Int): String = Integer.toBinaryString(number)