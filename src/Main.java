import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 54, 3, 21));
        int sum = 0;
        for (int so : list) {
            sum+=so;
        }
        System.out.println(sum);
    }
}