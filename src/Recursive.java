public class Recursive {
    public static int fact(int n) {

        if(n == 1|| n == 0){ return 1;}
        else{ return n * fact(n -1);}

    }
}
