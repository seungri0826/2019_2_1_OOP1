
public class Dice {
	private int value;
	
	public Dice() {value=0;}
	
	void roll() {
		int v = (int)(Math.random()*6) +1;
		setValue(v);
	}
	
	void setValue(int v) {	value = v;	}
	
	int getValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int a, b;
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		do {
			dice1.roll();
			dice2.roll();
			a = dice1.getValue();
			b = dice2.getValue();
			
			System.out.println("주사위1="+a+" 주사위2="+b);
						
			count++;
		}while((a+b)!=2);
		
		System.out.println("(1,1)이 나오는데 걸린 횟수="+count);
	}

}
