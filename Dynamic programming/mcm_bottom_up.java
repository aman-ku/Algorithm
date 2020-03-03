import java.util.*;
class mcm_bottom_up
{
	
	public static int matrixChainMultiplication(int[] dims)
	{
		int n = dims.length;

		int[][] c = new int[n + 1][n + 1];

		for (int len = 2; len <= n; len++)
		{
			for (int i = 1; i <= n - len + 1; i++)
			{
				int j = i + len - 1;
				c[i][j] = Integer.MAX_VALUE;

				for (int k = i; j < n && k <= j - 1; k++)
				{
					int cost = c[i][k] + c[k + 1][j]
							+ dims[i - 1] * dims[k] * dims[j];

					if (cost < c[i][j]) {
						c[i][j] = cost;
					}
				}
			}
		}
		return c[1][n - 1];
	}	
	
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of matrix ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the dimensions");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
		System.out.println("Minimum number of multiplication is "+ matrixChainMultiplication(arr));
	}
}