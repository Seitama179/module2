
import java.util.Stack;

public class MyArray {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(arr[num]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

}
