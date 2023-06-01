package prob12;
import java.util.Optional;
public class MySingleton {
	private static int count = 0;
	private static MySingleton instance = null;
	private MySingleton() {
		count++;
	}
	//Uses ofNullable in place of null checks
	public static MySingleton getInstance() {
		return Optional.ofNullable(instance).orElseGet(() -> setAndGet());
	}
	
	private static MySingleton setAndGet() {
		instance = new MySingleton();
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			getInstance();
		}
		System.out.println(count);
	}
}
