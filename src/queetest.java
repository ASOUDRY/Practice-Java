import java.util.LinkedList;
import java.util.Queue;

public class queetest {
	public static void main(String[] args) {
        // Create a new queue
        Queue<String> myQueue = new LinkedList<>();

        // Add elements to the queue
        myQueue.add("Alice");
        myQueue.add("Bob");
        myQueue.add("Charlie");

        // Print the queue
        System.out.println("Queue: " + myQueue);

        // Remove the first element from the queue
        String firstElement = myQueue.remove();

        // Print the first element and the updated queue
        System.out.println("Removed: " + firstElement);
        System.out.println("Queue after removing the first element: " + myQueue);
    }

}
