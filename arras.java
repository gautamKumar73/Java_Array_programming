import java.util.*;
class  arras
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,4,5,6};
		int []brr=new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1;i++)
		{
			
			if(arr[i]!=arr[i+1])
			{
               System.out.println(arr[i]);	
				brr[j++]=arr[i];
			}
		}
		brr[j]=arr[arr.length-1];
		System.out.println(Arrays.toString(brr));
	}
}
