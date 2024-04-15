package java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingWithExecutor {

	ExecutorService executor = Executors.newFixedThreadPool(10);

	static Callable<String> callable = new Callable<String>() {
		public String call() throws InterruptedException {
			Thread.sleep(1000);
			return "abc";
		}
	};
	
	static Callable<String> callable2 = () -> {
	     	return "abc2";
	};

	public void test() throws InterruptedException, ExecutionException {
		Future<String> result = executor.submit(callable);
		System.out.println(result.get());
	    result = executor.submit(callable2);
		System.out.println(result.get());
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MultiThreadingWithExecutor obj = new MultiThreadingWithExecutor();
		obj.test();
	}

}
