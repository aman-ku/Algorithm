import java.util.*;
class A
{
	public void cut_rod(int p[],int n)
	{
		int rows=n;
		int cols=n;
		int m[][]=new int[rows+1][cols+1];
		for(int i=0;i<=rows;i++)
		{
			m[i][0]=0;
		}
		for(int i=0;i<=cols;i++)
		{
			m[0][i]=0;
		}
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if(j>=i)
				{
					m[i][j]=max(m[i-1][j],p[i-1]+m[i][j-1]);
				}
				else
				{
					m[i][j]=m[i-1][j];
				}
			}
		}
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=rows;j++)
			{
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		System.out.println(m[rows][cols]);
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
class rodcutting_iterative
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
		ob.cut_rod(arr,n);
		// System.out.println(w);

	}
}