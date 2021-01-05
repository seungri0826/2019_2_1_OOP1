
public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=0;
		
		for(x=0;x<=10;x++)
		{
			for(y=0;y<=10;y++)
			{
				if ((3*x+10*y)==100)
				{
					System.out.printf("(%d,%d)\n", x,y);
				}
			}
		}

	}

}
