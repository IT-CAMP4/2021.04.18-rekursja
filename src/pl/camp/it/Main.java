package pl.camp.it;

public class Main {
    public static void main(String[] args) {
        System.out.println(silnia(5));
    }

    public static int silnia(int a) {
        if(a == 1) {
            return 1;
        }
        return a * silnia(a-1);
    }
}
