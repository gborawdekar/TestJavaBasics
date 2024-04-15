package a;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("run : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			/*
			 * try { wait(); } catch (InterruptedException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); }
			 */
		}
		
		
	}

}
