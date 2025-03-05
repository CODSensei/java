
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < 3; i++) {
        //     for (int k = 2; k > i; k--) {
        //         System.out.print(' ');
        //     }
        //     for (int j = 0; j < 2 * i + 1; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // List<String> arr = new ArrayList<>();
        // arr.add("x");
        // arr.add("x");
        // arr.add("x");
        // arr.add("x");
        // arr.add("x");
        // arr.add("x");
        // arr.add("x");
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Krishna", 9);
        marks.put("Mukul", 8);
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-----------------");
        }
    }
}
