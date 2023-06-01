package prob6;

public class MultiThreadedTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		System.out.println("Queue State : " + queue.toString());
		for (int i = 0; i < 5; ++i) {
			multipleCalls(queue);
		}
		System.out.println("Queue State : " + queue.toString());
		System.out.println(queue.getAddCounter());
	}

	public static void multipleCalls(Queue queue) {
		Runnable r = () -> {
			for (int i = 0; i < 2; ++i) {
				queue.add("1");
			}
		};
		for (int i = 0; i < 2; ++i) {
			new Thread(r).start();
		}
	}
}
