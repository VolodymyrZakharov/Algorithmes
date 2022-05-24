public class Task1 {
    // Найти последнюю цифру числа фибоначи под номером до 2^31-1

    public long lastFibonacciDigit(int number) {
        if (number <= 0)
            throw new OutOfBoundsException();
        long first = 0;
        long second = 1;
        long result = 0;
        for (int i = 1; i < number; i++) {
            result = (first + second) % 10;
            second = first;
            first = result;
        }
        return result;
    }
}
