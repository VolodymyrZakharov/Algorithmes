public class Task2 {

    public int getNumberOfCoins(int money) {
        int ten = money / 10;
        int five = money % 10 / 5;
        int one = money % 10 % 5;
        return ten + five + one;
    }
}
