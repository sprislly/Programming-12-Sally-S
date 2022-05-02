public class Main {
    static int count;
    public static void printMove(int p1, int p2){
        System.out.println("Move: " + p1 + " to " +p2);
        count ++;
    }
    public static void towers(int n, int from, int spare, int to){
        if (n == 1){
            printMove(from, to);

        } else {
            towers(n-1, from, to, spare);
            printMove(from, to);
            towers(n-1, spare, to, from);
        }
    }
    public static void main(String[] args) {
        towers(3, 1, 2, 3);
        System.out.println(count);
    }

}

//2^n-1 to find calculation