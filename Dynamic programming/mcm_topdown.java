import java.util.*;
class mcm_topdown
{ 

	static int MatrixChainOrder(int p[], int n) 
	{ 
		int m[][] = new int[n][n]; 

		int i, j, k, l, q; 
		for (i = 1; i < n; i++) 
			m[i][i] = 0; 
        
            for (l=2; l<n; l++) 
		{ 
			for (i=1; i<n-l+1; i++) 
			{ 
				j = i+l-1; 
				if(j == n) continue; 
				m[i][j] = Integer.MAX_VALUE; 
				for (k=i; k<=j-1; k++) 
				{ 
					
					q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
					if (q < m[i][j]) 
						m[i][j] = q; 
				} 
			} 
		} 

		return m[1][n-1]; 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of matrix");
        n=sc.nextInt();
         System.out.println("Enter the dimension of the matrix");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
		} 
		System.out.println("Minimum number of multiplications is "+ MatrixChainOrder(arr, n)); 
	} 
}