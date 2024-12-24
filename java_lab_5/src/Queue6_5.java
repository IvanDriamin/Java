import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue6_5 {
    public static <T> Queue<T> QueueT(Queue<T> queue) {
        if (queue == null || queue.isEmpty()) {
            return new LinkedList<>();
        }
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        Queue<T> res = new LinkedList<>();
        while (!stack.isEmpty()) {
            res.offer(stack.pop());
        }
        return res;
    }
}
