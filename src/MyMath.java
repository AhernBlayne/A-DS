public class MyMath {
    public static int threeSmallestNumbers(int a, int b, int c) {
        int answer = 1;
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        }
       return answer;
    }

    public static int threeSmallestNumbersv2(int a, int b, int c) {

        int small = a;

        if (b < small) {
            small = b;
        }
        if (c < small) {
            small = c;
        }
        return small;
// faster solution
    }

    public static int findPow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) //exercise the for loop
            result *= a;
        return result;
    }

    public static int findSum(int a){
        int result = 0;
        for(int i = 1; i <= a; i++){
            result += i;
        }
        return result;
    }
}