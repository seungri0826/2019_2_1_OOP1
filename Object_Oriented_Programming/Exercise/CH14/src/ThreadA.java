
public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("스레드 B가 종료되기를 기다림...");
			b.wait();
			System.out.println("전체 합계: " + b.total);
		}

	}

}

class ThreadB extends Thread {
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i=0; i<1000; i++) {
				total += i;
			}
			notify();
		}
	}
}
