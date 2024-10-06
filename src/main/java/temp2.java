public class temp2 {
    public static void main(String[] args) {
        patternRevise6(4);
    }

    private static void patternRevise6(int n) {
        int sum = (n * (n + 1)) / 2;
        int x = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2 == 0){
                    System.out.print(x + " ");
                    x++;
                }else {
                    System.out.print(sum + " ");
                    sum--;
                }
            }
            System.out.println();
        }
    }
}
     /*
    When N = 4

            10
            1   2
            9   8   7
            3   4   5   6
    */
