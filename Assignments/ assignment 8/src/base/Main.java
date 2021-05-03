package base;
public class Main {

    public static int linearfibonacci(int i){
        if (i <= 1){
            return i; }
        else{
        return linearfibonacci(i - 1) + linearfibonacci(i - 2); }
    }

    public static int Headfibonacci (int i){
        if (i>1){
            return Headfibonacci(i - 1) + Headfibonacci(i -2);}
        else{
            return i; }
    }

    public static int tailfibonacci(int i, int total){
        if (i <= 1) {
            return i + total; }
        else {
            return tailfibonacci(i-1, total) + tailfibonacci(i - 1, total); }
    }

    public static void main(String[] args){
        System.out.println(linearfibonacci(11));
        System.out.println(Headfibonacci(24));
        System.out.println(tailfibonacci(4, 7));

    }



}
