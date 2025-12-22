import java.util.*;
class bubbaleshor 
{
	public static void main(String[] args) 
	{
		int []a={5,8,7,6,4,5,9,8};
		System.out.println(Arrays.toString(a));
		shortarr(a);
		System.out.println(Arrays.toString(a));
	}
	public static void shortarr(int []a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
