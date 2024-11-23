package linkedlist;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
            if (fast == 1) return true;
        } while(slow != fast);
        return false;
    }

    private static int sumOfSquare(int num) {
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }
        return sum;
    }
}
