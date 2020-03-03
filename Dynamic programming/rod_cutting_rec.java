import java.util.*;
class A
{
	public int rod_cut(int p[],int n)
	{
		if(n<=0)
		{
			return 0;
		}
		int q=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			q=max(q,p[i]+rod_cut(p,n-i-1));
		}
		return q;
		
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
class rod_cutting_rec
{
	public static void main(String args[])
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		int n,w=0;
		System.out.println("Enter the length of rod");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the price");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		w=ob.rod_cut(arr,n);
		System.out.println(w);

	}
}