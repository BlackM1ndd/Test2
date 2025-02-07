import java.util.*;

public class Elementсounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int num : list) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        return elementCount;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        System.out.println(countElements(input));
    }
}