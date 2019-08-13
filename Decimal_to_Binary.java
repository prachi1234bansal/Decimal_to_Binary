class Decimal_to_Binary
{
	public static void main(String args[])
	{
		//System.out.println(Integer.toBinaryString(25));
		int[] a=new int[10];
		int n=25;
		int i=0,j;
		while(n>0)
		{
			a[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.println("value of i"+i);
		for(j=i-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
	}
}