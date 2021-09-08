public class Addition
{
public static void main(String args[])
{
	int a =5670, b=3784;

	Addition ad = new Addition();
	int result = ad.sum(a,b);
	System.out.println(result);
	
	
}
	int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
}