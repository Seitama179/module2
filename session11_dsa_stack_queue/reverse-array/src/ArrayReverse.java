
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverseString(String str) {
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");
        for(String word : words) {
            stack.push(word);
        }
        List<String> reversedWords = new ArrayList<>();
        while (!stack.isEmpty()) {
            reversedWords.add(stack.pop());
        }
        System.out.println(reversedWords);
    }
}
