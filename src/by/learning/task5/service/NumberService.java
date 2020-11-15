package by.learning.task5.service;

public class NumberService {

    public int receiveSumOfDivisors(int value) {
        int sum = 0;

        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPerfectNumber(int value) {
        int sum = receiveSumOfDivisors(value);
        return (sum == value);
    }
}
