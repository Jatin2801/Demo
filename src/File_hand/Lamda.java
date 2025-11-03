package File_hand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12,33,44,11,34));
        list.forEach(num -> System.out.println(num));
    }
}
