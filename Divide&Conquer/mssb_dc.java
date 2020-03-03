import java.util.*;
class A
{
	public int crossing(int arr[],int l,int m,int h)
	{
		int ls=Integer.MIN_VALUE;
		int sum1=0;
		for(int i=m;i>=0;i--)
		{
			sum1+=arr[i];
			if(ls<sum1)
			{
				ls=sum1;
			}
		}
		int rs=Integer.MIN_VALUE;
		int sum2=0;
		for(int j=m+1;j<=h;j++)
		{
			sum2+=arr[j];
			if(rs<sum2)
			{
				rs=sum2;
			}
		}
		return ls+rs;
	}
	public int mssb(int arr[],int low,int high)
	{
		if(low==high)
		{
			return arr[low];
		}
		else 
		{
			int mid=(low+high)/2;
			int n1=mssb(arr,low,mid);
			int n2=mssb(arr,mid+1,high);
			int n3=crossing(arr,low,mid,high);
			return max(n1,n2,n3);
		}
	}
	public int max(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			return a;
		}
		else if(b>a&&b>c)
		{
			return b;
		}
		else 
		{
			return c;
		}
	}
}
class mssb_dc
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
		int len=arr.length;
		int ans=ob.mssb(arr,0,len-1);
		System.out.println(ans);
	}
}