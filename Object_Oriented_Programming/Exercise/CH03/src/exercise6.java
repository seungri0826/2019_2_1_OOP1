
public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;
		
		System.out.print("2���� 100���� ��� �Ҽ� : ");
		
		for(int k=2; k<=100; k++)
		{
			isPrime=true;
			for (int i=2; i<k; i++)
			{
				if(k%i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
			{
				System.out.print(k + " ");
			}
		}
	}

}
