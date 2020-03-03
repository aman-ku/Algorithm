import java.util.*;
public class lps_bottomup
{
    public static int LCSLength(String X, String Y, int n, int[][] T)
	{
		
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
				{
					
					if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				else 
				{
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
				}
		}
	}
	return T[n][n];
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String X;
		System.out.println("Enter the string");
		X=sc.nextLine();
	 	String Y = new StringBuilder(X).reverse().toString();
	 	int[][] T = new int[X.length() + 1][X.length() + 1];
	    System.out.println( "maximum palindrome of length is "+LCSLength(X, Y, X.length(), T));
	}
}
	