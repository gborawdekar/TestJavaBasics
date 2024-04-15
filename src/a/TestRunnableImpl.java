package a;

public class TestRunnableImpl {

	public static void main(String[] args) throws InterruptedException {
		RunnableImpl impl = new RunnableImpl();
		RunnableImpl2 impl2 = new RunnableImpl2();
		//impl.run();
		Thread t1 = new Thread(impl);
		//Thread t2 = new Thread(impl);
		
		Thread t3 = new Thread(impl2);
		Thread t4 = new Thread(impl2);
		
		t1.start();
		//t2.start();
		//t1.join();
		t3.start();
		t4.start();

		System.out.println("main");
	}

}
