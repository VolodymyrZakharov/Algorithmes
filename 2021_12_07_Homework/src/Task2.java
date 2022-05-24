public class Task2 {
    // Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m

    public long fibonacciModulo(int number, int m) {
        if (number <= 0 || m <= 0)
            throw new OutOfBoundsException();
        long first = 0;
        long second = 1;
        long result = 0;
        for (int i = 1; i < number; i++) {
            result = (first + second) % m;
            second = first;
            first = result;
        }
        return result;
    }
}
