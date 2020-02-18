import javax.sound.sampled.Line;

public class TestLinearSearch {
    public static void main(String args []){

        LinearSearch l = new LinearSearch();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int num = 5;
        boolean answer = l.find(num,a);
        if(answer == true){
            System.out.println("Found: " + num + "!");
        }
        else{
            System.out.println("Sorry not found!");
        }

    }
}
