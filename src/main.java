public class main {
    public static void main(String[] args) {
        System.out.println(SW(3, 3));
        for (int i = 0; i < 30; i++) {
            System.out.print("SW_DynamicProg(" + i + "," + i + ") = " + SW_DynamicProg(i, i));
            System.out.println(", time is: " + System.currentTimeMillis());
        }
    }

    static int SW(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        return SW(m - 1, n) + SW(m, n - 1);
    }


    static long SW_DynamicProg(int m, int n) {
        n = n + 1;
        m = m + 1;
        long[][] arr = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr[m - 1][n - 1];
    }
}

