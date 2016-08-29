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

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private int[][] triangle = {
            {1},
            {8, 4},
            {2, 6, 9},
            {8, 5, 9, 3}
    };

}
