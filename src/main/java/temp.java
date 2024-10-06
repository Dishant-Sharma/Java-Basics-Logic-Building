//public class temp {
//    public static void main(String[] args) {
//        printPattern(5);
//    }
//    static void printPattern(int n){
////        for (int row = 1; row <= n; row++) {
////            for (int col = 1; col <= row ; col++) {
////                System.out.print("*");
////            }
////            System.out.println();
////
////        }
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            while(col <= row){
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
////            col = 1;
//            row++;
//        }
//
//
//    }
//}
////        *
////        *   *
////        *   *   *
////        *   *   *   *
////        *   *   *   *   *
//
//// rows = 5
//// for "each" row number of cols = number of rows
//// after each row we move to next row until we reach n
//
//
//
//
//
//public class temp {
//
//    public static void main(String[] args) {
//        pattern_three(5);
//    }
//    static void pattern_two(int n ) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//
//        }
////        int row = 1;
////        while (row <= n) {
////            int col = 1;
////            while (col <= row) {
////                System.out.print(col);
////                col++;
////            }
////            System.out.println();
////            row++;
////
////        }
//    }
//
//    /*
//            1
//            1   2
//            1   2   3
//            1   2   3   4
//            1   2   3   4   5
//
//     */
//
//
//    static void pattern_three(int n ) {
////        for (int row = 1; row <= n; row++) {
////            for (int col = 1; col <= row; col++) {
////                System.out.print(row-col + 1);
////            }
////            System.out.println();
////        }
////        int row =1;
////        while(row <= n){
////            int col = 1;
////            while(col <= row){
////                System.out.print(row-col +1);
////                col++;
////            }
////            System.out.println();
////            row++;
////        }
//        for (int row = 1; row <= n; row++) {
//            for (int col = row; col >= 1; col--) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }
//    }
//
//    /*
//            1
//            2   1
//            3   2   1
//            4   3   2   1
//            5   4   3   2   1
//     */
//}