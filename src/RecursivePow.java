public class RecursivePow {
    public static double myPow(double x, int y){
        if( y == 0){ return 1;}
        else{ return x * myPow(x,y - 1);}
    }
}
