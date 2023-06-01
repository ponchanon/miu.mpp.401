package prob6;

public class MultiThreadedTestModified {

	public static void main(String[] args) {
		QueueModified queue = new QueueModified();
		queue.add(1);
		queue.add(2);
		System.out.println("Queue State : " + queue.toString());
		for (int i = 0; i < 5; ++i) {
			multipleCalls(queue);
		}
		System.out.println("Queue State : " + queue.toString());
		System.out.println(queue.getAddCounter());
	}

	public static void multipleCalls(QueueModified queue) {
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
