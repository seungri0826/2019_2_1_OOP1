
public class exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		
		for(i=1;i<100;i++)
		{
			for(j=1;j<100;j++)
			{
				for(k=1;k<100;k++)
				{
					if ((i*i+j*j)==k*k)
					{
						System.out.printf("%d %d %d\n", i,j,k);
						break;
					}
				}
			}
		}

	}

}
