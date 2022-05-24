public class Task3 {
    // найти НОД (наибольший общий делитель)

    public int findNod(int n, int x) {
        if (n == 0)
            return Math.abs(x);

        if (x == 0)
            return Math.abs(n);

        if (n % x == 0) {
            return Math.abs(x);
        } else
            return findNod(x, n % x);
    }

    // найти НОК.

    public int findNok(int n, int x) {
        if (n == 0 || x == 0)
            throw new OutOfBoundsException();

        if (Math.abs(n) > Math.abs(x)) {
            int nok = n;
            while (nok % x != 0) {
                nok += n;
            }
            return Math.abs(nok);
        }

        if (Math.abs(x) > Math.abs(n)) {
            int nok = x;
            while (nok % n != 0) {
                nok += x;
            }
            return Math.abs(nok);
        }
        return Math.abs(n);
    }
}
