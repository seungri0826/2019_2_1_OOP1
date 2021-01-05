
public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("������ B�� ����Ǳ⸦ ��ٸ�...");
			b.wait();
			System.out.println("��ü �հ�: " + b.total);
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
