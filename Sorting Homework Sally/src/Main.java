import java.util.ArrayList;

public class Main {
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    a.add(27, 24, 23, 15, 10, 8);
    b.add(84, 81, 35, 25, 14, 11, 8, 5, 2);

    Merger sort = new Merger(a, b);
}
