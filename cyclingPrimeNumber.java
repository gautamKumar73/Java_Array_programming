import java.util.*;
class cyclingPrimeNumber 
{
	public static void main(String[] args) 
	{
		int a=1193;
		int[]b=new int [4];
		
		for(int i=0; i<4;i++ ){
			b[i]=a%10;
			a=a/10;
		}
		int l=0, r=b.length-1;
		while(l<r){
			int temp=b[l];
			b[l]=b[r];
			b[r]=temp;
			l++;
			r--;
		}
		isCycleingPrime1(b);
		if(isCycleingPrime(b)){
			System.out.println("its a cycling Prime Number");
		}else{
			System.out.println("it is not a cycling prime Number");
		}
		
	}
	
	public static arr[] isCycleingPrime1(int[]b)
	{
		
		for(int k=1; k<4; k++)
		{
			int first=b[0];
			for(int i=1; i<b.length; i++)
			{
				b[i-1]=b[i];
			}
			b[b.length-1]=first;
			System.out.println(b);
		}
		return c
	} 
	
	public static boolean isCycleingPrime(int []d)
	{
		
	}
	
}
