package day3;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class RecentCounter {
	private Queue<Integer> queue;
	public RecentCounter() {
		queue = new ArrayBlockingQueue<>(10000);
	}
	public int ping(int t) {
		queue.add(t);
		while(queue.peek() < t - 3000) {
			queue.poll();
		}
		return queue.size();
	}
	public static void main(String[] args) {
		RecentCounter counterPing = new RecentCounter();
		
		System.out.println(counterPing.ping(1));
		System.out.println(counterPing.ping(2));
		System.out.println(counterPing.ping(3000));
		System.out.println(counterPing.ping(5000));
		System.out.println(counterPing.ping(7000));
		System.out.println(counterPing.ping(20000));
		
	}
}
