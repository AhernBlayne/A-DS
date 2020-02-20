public class ReverseString {

    public static String reverse(String str){
        if(str.isEmpty() || str.length()==1){ return str;}
        char front = str.charAt(0);

        String remainder = str.substring(1);
        String reverseRemainder = reverse(remainder);
        return reverseRemainder + front;

    }
}
