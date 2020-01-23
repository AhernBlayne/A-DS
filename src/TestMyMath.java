public class TestMyMath {
    public static void main (String args []){


        System.out.println(MyMath.threeSmallestNumbersv2(9,3,6));
        //make sure to effectively test my methods
        int result = MyMath.findPow(100,0); // expect 1
        System.out.println(result);

        int result2 = MyMath.findPow(102,1); // expect 102
        System.out.println(result2);

        int result3 = MyMath.findPow(2,10); // expect 1024
        System.out.println(result3);

        int result4 = MyMath.findSum(10); // expect 55
        System.out.println(result4);

        int result5 = MyMath.findSum(0); // expect 0
        System.out.println(result5);

        int result6 = MyMath.findSum(2); // expect 3
        System.out.println(result6);
    }


    }


