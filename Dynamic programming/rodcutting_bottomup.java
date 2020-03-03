import java.util.*;
class A
{
	public int cut_rod(int p[],int n)
	{
		int r[]=new int[n+1];
		r[0]=0;
		for(int j=1;j<=n;j++)
		{
			int q=Integer.MIN_VALUE;
			for(int i=0;i<j;i++)
			{
				q=max(q,p[i]+r[j-i-1]);
			}
			r[j]=q;
		}
		return r[n];
	}
	public int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}
}
class rodcutting_bottomup
{
	public static void main(String args[])
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		int n,w;
		System.out.println("Enter the length of rod");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the price");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		w=ob.cut_rod(arr,n);
		System.out.println(w);

	}
}