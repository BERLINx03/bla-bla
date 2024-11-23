package linkedlist

import linkedlist.HappyNumber.isHappy


object HappyNumber {

    fun isHappy(n: Int): Boolean{
         fun sumOfSquare(n: Int): Int{
            var num = n
            var sum = 0
            while (num > 0){
                val rem = num % 10;
                sum += rem * rem
                num /= 10
            }
            return sum
        }
        var slow = n
        var fast = n
        do {
            slow = sumOfSquare(slow)
            fast = sumOfSquare(sumOfSquare(fast))

            if (fast == 1) return true
        } while (slow != fast)
        return false
    }

}

fun main(){
    val n = 19
    println(if (isHappy(n)) "happy happy happy" else "unlucky")
}