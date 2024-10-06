import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PatternsBox {

    public static void main(String[] args) {
        patternFivePointOne(5);
    }

    static void patternOne(int n){
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        int row = 1;
        while(row <= n){
            int col = 1;
            while(col <= row){
                System.out.print("*");
                col++;
            }
            System.out.println();
//            col = 1;
            row++;
        }


    }

//        *
//        *   *
//        *   *   *
//        *   *   *   *
//        *   *   *   *   *

// rows = 5
// for "each" row number of cols = number of rows
// after each row we move to next row until we reach n

    static void pattern_two(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
//        int row = 1;
//        while (row <= n) {
//            int col = 1;
//            while (col <= row) {
//                System.out.print(col);
//                col++;
//            }
//            System.out.println();
//            row++;
//
//        }
    }

    /*
            1
            1   2
            1   2   3
            1   2   3   4
            1   2   3   4   5

     */


    static void pattern_three(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(row-col + 1);
//            }
//            System.out.println();
//        }
//        int row =1;
//        while(row <= n){
//            int col = 1;
//            while(col <= row){
//                System.out.print(row-col +1);
//                col++;
//            }
//            System.out.println();
//            row++;
//        }
        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
            1
            2   1
            3   2   1
            4   3   2   1
            5   4   3   2   1
     */

    static void patternFour(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
//                System.out.print((row-col) %2 );
                System.out.print(col % 2);
            }
            System.out.println();

        }
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            while (col <= row){
//                System.out.print(col % 2);
//                col++;
//            }
//            System.out.println();
//            row++;
//        }
    }
    /*
            1
            1 0
            1 0 1
            1 0 1 0
            1 0 1 0 1
     */


    static void patternFive(int n) {
//        int passNumber = 1;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <=row; col++){
//                System.out.print(passNumber+" ");
//                passNumber++;
//            }
//            System.out.println();
//        }
        int row = 1, passNumber = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(passNumber + " ");
                passNumber++;
                col++;
            }
            System.out.println();
            row++;
        }
    }


    /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
     */

    static void patternFivePointOne(int n) {
        int passNumber = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(passNumber + " ");
                passNumber++;
            }
            System.out.println();
        }
    }

    /*
            1  2  3  4  5
            6  7  8  9  10
            11 12 13 14 15
            16 17 18 18 20
            21 22 23 24 25
     */

    static void patternSix(int n) {
        int decrement = n * (n + 1) / 2;
        int increment = 1;
//        for (int row = 1; row <= n ; row++) {
//            for (int col = 1; col <= row ; col++) {
//                if(row % 2 == 1){
//                    System.out.print(decrement+" ");
//                    decrement--;
//                }else{
//                    System.out.print(increment+" ");
//                    increment++;
//                }
//            }
//            System.out.println();
//        }
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (row % 2 == 1) {
                    System.out.print(decrement + " ");
                    decrement--;
                } else {
                    System.out.print(increment + " ");
                    increment++;
                }
                col++;
            }
            System.out.println();
            row++;
        }

    }
    /*
    When N = 4

            10
            1   2
            9   8   7
            3   4   5   6
    */


    /*
    When N = 5

            15
            1   2
            14  13  12
            3   4   5   6
            11  10  9   8   7
     */
    static void patternSeven(int n) {
        int x = 0;
        int y = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int sum = x + y;
                x = y;
                y = sum;
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }

    /*
            1
            1 2
            3 5 8
            13 21 34 55
     */
    static void patternEight(int n) {
        for (int row = 1; row <= n; row++) {
            int x = 0;
            int y = 1;
            for (int col = 1; col <= row; col++) {
                int sum = x + y;
                x = y;
                y = sum;
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
    /*
            1
            1 1
            1 1 2
            1 1 2 3
            1 1 2 3 5
            1 1 2 3 5 8
    */

    static void patternEightOrderOfN(int n) {
        int x = 0;
        int y = 1;
        String result = "";
//        for (int row = 1; row <= n; row++){
//            int sum = x + y;
//            x = y;
//            y = sum;
//            result = result+x+" ";
//            System.out.println(result);
//        }
        int row = 1;
        while (row <= n) {
            int sum = x + y;
            x = y;
            y = sum;
            result = result + x + " ";
            System.out.println(result);
            row++;
        }
    }

         /*
            1
            1 1
            1 1 2
            1 1 2 3
            1 1 2 3 5
            1 1 2 3 5 8
    */

    static void patternNine(int n) {
//            for(int row = 1; row <= n; row ++){
//                int oddCounter = 0;
//                for(int col = 1; col <= row; col++){
//                    oddCounter = col+oddCounter;
//                    System.out.print(oddCounter+" ");
//                }
//                System.out.println();
//            }
        int row = 1;
        while (row <= n) {
            int counter = 0;
            int col = 1;
            while (col <= row) {
                counter = col + counter;
                System.out.print(counter + " ");
                col++;
            }
            System.out.println();
            row++;
        }

    }

        /*
                1
                1 3
                1 3 6
                1 3 6 10
                1 3 6 10 15
                1 3 6 10 15 21
         */

    static void patternTen(int n) {
//            for (int row = n; row >= 1 ; row--) {
//                for (int col = row; col >= 1; col--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
        int row = n;
        while (row >= 1) {
            int col = row;
            while (col >= 1) {
                System.out.print("* ");
                col--;
            }
            System.out.println();
            row--;
        }
    }


    /*      ***
     **
     *
     **
     *

     */


    static void patternElevenPointOne(int n) {
        // prints all the prime numbers till n with flag variable
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(i + " ");
            }
        }
    }

    static void patternElevenPointTwo(int n) {
        // prints all the prime numbers till n without flag variable
        for (int i = 2; i <= n; i++) {
            int x;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    break;
                }
            }
            if (x == i) {
                System.out.print(i + " ");
            }
        }
    }

    static void patternElevenPointThree(int n) {
        // prints all the prime numbers till n without flag variable and using function
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        int x;
        for (x = 2; x < n; x++) {
            if (n % x == 0) {
                break;
            }
        }
        return x == n;

    }

    static void patternElevenPointFour(int n) {
        int counter = 0;
        // first n-1  prime numbers without flag
        for (int i = 1; counter != n; i++) {
            int x;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    break;
                }
            }
            if (x == i) {
                counter++;
                System.out.print(i + " ");
            }
        }
    }

    static void patternEleven(int n) {
        for (int row = 1; row <= n; row++) {
            patternElevenPointFour(row);
            System.out.println();
        }
    }

    static List<Integer> givePrimeNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        int counter = 1;
        // first n prime numbers
        for (int i = 1; counter != n; i++) {
            int x;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    break;
                }
            }
            if (x == i) {
                counter++;
                result.add(i);
            }
        }
        return result;
    }

        /*      2
                2 3
                2 3 5
                2 3 5 7
                2 3 5 7 11
                2 3 5 7 11 13
                2 3 5 7 11 13 17
          */

    static void patternTwelve(int n) {
        int totalPrimeNos = (n * (n + 1)) / 2;
        List<Integer> result = getPrime(totalPrimeNos);
        int index = 0;
        System.out.println(result);
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(result.get(index) + " ");
                index++;
            }
            System.out.println();
        }
    }

    static List<Integer> getPrime(int n) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        // first n-1  prime numbers without flag
        for (int i = 1; counter != n; i++) {
            int x;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    break;
                }
            }
            if (x == i) {
                counter++;
                result.add(x);
            }
        }
        return result;
    }

        /*
                2
                3  5
                7  11 13
                17 19 23 29
         */

    static void patternThirteen(int n) {
        List<Integer> result = getPrime(n);
        int index = 0;
        System.out.println(result);
        for (int row = 1; row <= n; row++) {
//                for(int i = 1; i<= result.get(index); i++){
//                    System.out.print("*");
//                }
            System.out.println("*".repeat(result.get(index)));
//                System.out.println();
            index++;
        }

    }

    /*
     **
     *
     ***
     ***
     */

    static void patternFourteen(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            char result = 'A';
            for (int j = 1; j <= counter; j++) {
                System.out.print(result + " ");
                result++;
            }
            counter += 2;
            System.out.println();
        }
    }

    /*
                A
                A B C
                A B C D E
                A B C D E F G
                A B C D E F G H I
                A B C D E F G H I J K
     */
    static void patternFifteen(int n) {

        for (int row = 1; row <= n; row++) {
            char result = 'A';
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print(result);
                result++;
            }
            System.out.println();
        }
    }

    /*
                A B C D E
                  A B C D
                    A B C
                      A B
                        A
     */
    static void patternSixteen(int n) {
        char oddChar = 'b';
        char evenChar = 'A';
        int counter = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (counter % 2 == 1) {
                    System.out.print(evenChar);
                    evenChar += 2;
                } else {
                    System.out.print(oddChar);
                    oddChar += 2;
                }
                counter++;
            }
            System.out.println();
        }
    }
        /*
                A ascii is 65
                a ascii is 97
                Difference is 32
                Now, whenever there is even number You just have to add 32 in your current character
         */

        /*
                    A
                    b C
                    d E f
                    G h I j
                    K l M n O
         */

    static void patternSeventeenth(int n) {
        for (int row = 1; row <= n; row++) {
//                List remainderList = new ArrayList<>();
            String result = "";
            int x = row;
            while (x > 0) {
//                    remainderList.add(x % 2);
                result = (x % 2) + result;
                x = x / 2;
            }
//                for(int l = remainderList.size(); l >= 0; l--){
//                    System.out.println(remainderList.get(l));
//                }
            System.out.println(result);
        }
    }

        /*
                    1
                    10
                    11
                    100
                    101
                    110
                    111
                    1000
         */


    static void pattern18Point1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n - row); col++) {
                System.out.print(" ");
            }
            for (int i = (n - row) + 1; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
                /*
                     5
                    45
                   345
                  2345
                 12345
                    */

    static void pattern18Point2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

                /*
                    12345
                     2345
                      345
                       45
                        5
                */

    static void dummy() {
        System.out.print("one");
        System.out.print("two");
        System.out.println();
        System.out.print("four");
        System.out.print("five");
    }

    static void patternEighteen(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n - row); col++) {
                System.out.print(" ");
            }
            for (int i = (n - row) + 1; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
               12345
                2345
                 345
                  45
                   5
                  45
                 345
                2345
               12345
     */
    static void patten19PointOne(int n) {
//            BRUTE FORCE
//            for(int row = 1; row <= n; row++){
//                for (int col = n; col >= row; col--){
//                    System.out.print(col);
//                }
//                System.out.println();
//            }
        for (int row = n; row >= 1; row--) {
            int middle = n;
            for (int col = row; col >= 1; col--) {
                System.out.print(middle);
                middle--;
            }
            System.out.println();
        }
    }

              /*
                    54321
                    5432
                    543
                    54
                    5
               */

    static void patten19PointTwo(int n) {
//            for(int row = 1; row <=n; row++){
//                int middle = n;
//                for (int col = 1; col <= row; col++){
//                    System.out.print(middle);
//                    middle--;
//                }
//                System.out.println();
//            }
//            for(int row = 1; row <=n; row++){
//                for (int col = n; col > n - row; col--){
//                    System.out.print(col);
//                }
//                System.out.println();
//            }
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= row; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

        /*
                    5
                    54
                    543
                    5432
                    54321
         */

    static void patternNineteen(int n) {
        for (int row = n; row >= 2; row--) {
            // OR for(int row = n; row >= 1; row--){
            int middle = n;
            for (int col = row; col >= 1; col--) {
                System.out.print(middle);
                middle--;
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            // OR for(int row = 2; row <=n; row++){
            int middle = n;
            for (int col = 1; col <= row; col++) {
                System.out.print(middle);
                middle--;
            }
            System.out.println();
        }
    }


    /*
               54321
               5432
               543
               54
               5
               54
               543
               5432
               54321
     */
    static void pattern20Point1(int n) {
//                for(int row = n; row >= 1; row--){
//                    int middle = 1;
//                    for(int col = row; col >= 1; col--){
//                        System.out.print(middle);
//                        middle++;
//                    }
//                    System.out.println();
//                }
//                for(int row = 1; row <= n; row++){
//                    for(int col = 1; col <= (n - row + 1); col++){
//                        System.out.print(col);
//                    }
//                    System.out.println();
//                }
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
                12345
                1234
                123
                12
                1
     */
    static void pattern20Point2(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n - row; col >= 1; col--) {
                System.out.print(" ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }                    /*
                                54321
                                 4321
                                  321
                                   21
                                    1
                     */

    static void patternTwenty(int n) {
        for (int row = 1; row <= n; row++) {
            int limit = n - row + 1;
            for (int print = 1; print <= limit; print++) {
                if (print != n) {
                    System.out.print(print);
                }
            }
            for (int space = 2 * limit; space < 2 * n - 1; space++) {
                // for spacing we need to find the total number of values printed in a particular
                // row i.e. the end point of first printed loop and starting point of the second printing reverse loop
                System.out.print(" ");
            }
            for (int print = limit; print >= 1; print--) {
                System.out.print(print);
            }
            System.out.println();
        }
    }

    /*
            123454321
            1234 4321
            123   321
            12     21
            1       1
     */
    static void pattern21(int n) {
        for (int row = n; row >= 1; row--) {
            int limit = n - row + 1;
            for (int col = 1; col <= limit; col++) {
                if (col != n) {
                    System.out.print(col);
                }
            }
            for (int space = 2 * limit; space < 2 * n - 1; space++) {
                System.out.print(" ");
            }
            for (int col = limit; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

                /*
                            1       1
                            12     21
                            123   321
                            1234 4321
                            123454321
                 */


    static void pattern22(int n) {
        int patternOne = n / 2;
        for (int row = 1; row < patternOne; row++) {
            int limit = patternOne - row + 1;
            for (int print = 1; print <= limit; print++) {
                if (print != patternOne) {
                    System.out.print(print);
                }
            }
            for (int space = 2 * limit; space < 2 * patternOne - 1; space++) {
                System.out.print(" ");
            }
            for (int print = limit; print >= 1; print--) {
                System.out.print(print);
            }
            System.out.println();
        }
        for (int row = patternOne; row >= 1; row--) {
            int limit = patternOne - row + 1;
            for (int col = 1; col <= limit; col++) {
                if (col != patternOne) {
                    System.out.print(col);
                }
            }
            for (int space = 2 * limit; space < 2 * patternOne - 1; space++) {
                System.out.print(" ");
            }
            for (int col = limit; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void test() {
        int n = 6;
        int total = n * 2 - 1;
        for (int i = total; i >= 1; i--) {
            for (int j = 1; j <= i - n + 1; j++) {
                System.out.print(j);
            }

            for (int j = (2 * (i - n + 1)); j < total && j > 0; j++) {
                if (i == total)
                    continue;
                System.out.print(" ");
            }

            for (int j = i - n + 1; j >= 1; j--) {
                if (j == n)
                    continue;
                System.out.print(j);
            }

            for (int k = 1; k <= n - i + 1 && (n - i) > 0; k++)
                System.out.print(k);

            for (int k = total; i < n && k > 2 * (n - i + 1); k--)
                System.out.print(" ");

            for (int k = total / 2 - i + 2; i < n && k >= 1; k--) {
                if (k == total / 2 + 1)
                    continue;
                System.out.print(k);
            }
            System.out.println("");
        }
    }
                    /*      123454321                       9   9 + 0
                            1234 4321                       8   8 + 1
                            123   321                       7   6 + 3
                            12     21                       6   4 + 5
                            1       1                       5   2 + 7
                            12     21                       4
                            123   321                       3
                            1234 4321                       2
                            123454321                       1
                 */

    static void pattern23(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

                /*
                                0
                               10
                              101
                             0101
                 */


    static void pattern24(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */

    static void pattern25(int n) {
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void pattern26(String n) {
        // Binary to decimal conversion

        int power = 0;
        int sum = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int c = n.charAt(i) - '0';
            int v = c * calculatePower(2, power);
            sum += v;
            power++;
        }
        System.out.println("For Binary input: " + n + ", Decimal equivalent is: " + sum);
    }

    private static int calculatePower(int base, int power) {
        int sum = 1;
        while (power != 0) {
            sum *= base;
            power--;
        }
        return sum;
    }

    static void pattern27(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            System.out.println(result.multiply(BigInteger.valueOf(i)));
            result = result.multiply(BigInteger.valueOf(i));
        }
    }
                /*
                        1
                        2
                        6
                        24
                        120
                        720
                 */


    static void pattern28(int n) {
        for (int i = n; i >= 1; i--) {
            BigInteger result = BigInteger.ONE;
            for (int j = i; j >= 1; j--) {
                result = result.multiply(BigInteger.valueOf(j));
            }
            System.out.println(result);
        }
    }

    static void pattern28PointOne(int n) {
        // lesser computations happening for pattern 28 like only for n we calculate and then we use that result foo others unlike previous implementation where we were calculating for all
        BigInteger result = BigInteger.ONE;
        for (int i = n; i >= 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        int j = n;
        do {
            System.out.println(result);
            result = result.divide(BigInteger.valueOf(j));
            j--;
        } while (j >= 1);
//                for (int i = n; i >= 1; i--) {
//                    System.out.println(result);
//                    result = result.divide(BigInteger.valueOf(i));
//                }
    }
                /*
                        720
                        120
                        24
                        6
                        2
                        1
                 */

    public static void pattern29(int n) {
        if (n % 2 == 1) {
            printTrianglePattern(n);
        } else {
            printTrianglePattern(n + 1);
        }
    }

    private static void printTrianglePattern(int n) {
//            for(int i = 1 ; i<= n/2+1; i++){
//                for (int j = 1; j<= i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            for (int i = n/2+2; i<= n; i++){
//                for (int j = i; j<= n; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
        for (int i = 1; i <= n; i++) {
            int rowNumber;
            if (i <= n / 2 + 1) {
                rowNumber = i;
            } else {
                rowNumber = n - i + 1;
            }
            for (int j = 1; j <= rowNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * *
     *
     */

    static void pattern30(int n) {
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i && i <= n; k++) {
                System.out.print("* ");
            }
            for (int j = n; j > totalRows - i + 1 && i > n; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalRows - i + 1 && i > n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void pattern31(int n) {
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i && i <= n; j++) {
                System.out.print(" ");
            }
            for (int k = n - i + 1; k >= 1; k--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= totalRows - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = n + 1; k > totalRows - i + 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     * *
     * * *
     * * * *
     * * * * *
     */

    static void pattern32(int n) {
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    /*
     * * * *
     *     *
     *     *
     * * * *
     */

    //            static void pattern33(int n){
//                for (int row = 1; row <= n ; row++) {
//                    for (int firstSpace = 1; firstSpace < ; firstSpace++) {
//
//                    }
//                }
//            }
    /*

     *
     * *
     *  *
     * *
     *
     */
    static void pattern34(int n) {
        int oddTracker = 2;
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                for (int firstSpace = 1; firstSpace <= n - i; firstSpace++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i > 1) {
                    for (int secondSpace = 1; secondSpace < oddTracker; secondSpace++) { // for (int secondSpace = 1; secondSpace < 2 * i -2 ; secondSpace++) {
                        System.out.print(" ");
                    }
                    oddTracker += 2;
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    /*
     *
     * *
     *   *
     * * * *
     */

    static void pattern35(int n) {
        for (int row = n; row >= 1; row--) {
            int limit = n - row + 1;
            for (int space = limit; space <= n - 1; space++) {
                System.out.print(" ");
            }
            for (int col = limit; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern35Point1(int n) {
        int row = n;
        do {
            int limit = n - row + 1;
            int space = limit;
            do {
                if (space < n) {
                    System.out.print(" ");
                }
                space++;
            } while (space <= n);

            int col = limit;
            do {
                System.out.print(col);
                col--;
            } while (col >= 1);

            System.out.println();
            row--;
        } while (row >= 1);
    }

        /*
                                            1
                                           21
                                          321
                                         4321
                                        54321
         */
}


