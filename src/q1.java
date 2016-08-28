import java.util.Arrays;

/**
 * Created by Cemre on 28.8.2016.
 */
public final class q1 implements main {

    public static void main(String[] args) {
        System.out.println(new q1().run());
    }


    public String run() {
        System.out.println(triangle[0][0]);
        int topValue = triangle[0][0];
        for (int i = triangle.length - 2; i >= 0; i--) {
            int j;
            for (j = 0; j < triangle[i].length; j++) {
                if (isPrime(triangle[i + 1][j])) {
                    triangle[i][j] += triangle[i + 1][j + 1];
                } else if(isPrime(triangle[i + 1][j+1])){
                    triangle[i][j] += triangle[i + 1][j];
                }else{
                    triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
                }
            }
            System.out.println(i + "-->" + j);
        }
        triangle[0][0] += topValue;
        return Integer.toString(triangle[0][0]);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    private int[][] triangle = {
            {1},
            {8, 4},
            {2, 6, 9},
            {8, 5, 9, 3}
    };

}
