import java.util.ArrayList;

///**
// * Created by Cemre on 28.8.2016.
// */
public class q2  {

    private static int[][] arrlist;
    private static ArrayList list = new ArrayList();

    public static void main(String[] args) throws Exception {
        int[][] data = {
            {215},
            {193, 124},
            {117, 237, 442},
            {218, 935, 347, 235},
            {320, 804, 522, 417, 345},
            {229, 601, 723, 835, 133, 124},
            {248, 202, 277, 433, 207, 263, 257},
            {359, 464, 504, 528, 516, 716, 871, 182},
            {461, 441, 426, 656, 863, 560, 380, 171, 923},
            {381, 348, 573, 533, 447, 632, 387, 176, 975, 449},
            {223, 711, 445, 645, 245, 543, 931, 532, 937, 541, 444},
            {330, 131, 333, 928, 377, 733, 17, 778, 839, 168, 197, 197},
            {131, 171, 522, 137, 217, 224, 291, 413, 528, 520, 227, 229, 928},
            {223, 626, 34, 683, 839, 53, 627, 310, 713, 116, 629, 817, 410, 121},
            {924, 622, 911, 233, 325, 139, 721, 218, 253, 223, 528, 233, 230, 124, 233}
    };

        arrlist=data;
        func(0,0);
        System.out.println("Maximum Sum: " + func(0, 0));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static int func(int firstNumber, int secondNumber) {
        if (firstNumber >= arrlist.length)
            return 0;
        int initSum = arrlist[firstNumber][secondNumber];
        if (isPrime(initSum))
            return 0;
        else
            return initSum + Math.max(func(firstNumber + 1, secondNumber), func(firstNumber + 1, secondNumber + 1));
    }
}
