package com.ute.testgit

import kotlin.math.sqrt

object MathHelper {

    /**
     * Kiểm tra một số nguyên có phải là số nguyên tố hay không
     */
    fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        val limit = sqrt(number.toDouble()).toInt()
        for (i in 2..limit) {
            if (number % i == 0) return false
        }
        return true
    }
}