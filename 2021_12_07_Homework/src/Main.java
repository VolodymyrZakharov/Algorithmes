public class Main {

    public static void main(String[] args) {

        Task1 res1 = new Task1();
        System.out.println(res1.lastFibonacciDigit(Integer.MAX_VALUE));

        Task2 res2 = new Task2();
        System.out.println(res2.fibonacciModulo(Integer.MAX_VALUE, 3));

        Task3 res3 = new Task3();
        System.out.println(res3.findNod(10, 20));
        System.out.println(res3.findNok(10, 6));

    }
}
