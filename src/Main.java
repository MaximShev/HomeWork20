import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task3(words);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println("num = " + num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        int minNum = Integer.MIN_VALUE;
        for (Integer i : nums) {
            if (i % 2 == 0 && i != minNum) {
                System.out.println(i);
                minNum = i;
            }
        }
    }

    public static void task3(List<String> words) {
        System.out.println(new HashSet<>(words));
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values());
    }


}