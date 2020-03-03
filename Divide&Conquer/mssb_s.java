import java.util.*;
class A
{
	public int mssb(int arr[])
	{
		int ans=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=1;j<=n;j++)
			{
				if(i+j>n)
				{
					break;
				}
				else 
				{
					sum+=arr[i+j-1];
					ans=max(ans,sum);
				}
			}
		}
		return ans;
	}
	public int max(int n,int m)
	{
		if(n>m)
		{
			return n;
		}
		else 
		{
			return m;
		}
	}
}
class mssb_iter
{
	public static void main(String args[])
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=ob.mssb(arr);
		System.out.println(ans);

	}
}
