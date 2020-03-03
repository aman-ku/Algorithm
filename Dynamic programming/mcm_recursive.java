import java.util.*;
class mcm_recursive
{ 
    static int MatrixChainOrder(int p[], int i, int j) 
    { 
        if (i == j) 
            return 0; 
  
        int min = Integer.MAX_VALUE; 
        for (int k=i; k<j; k++) 
        { 
            int count = MatrixChainOrder(p, i, k) + 
                        MatrixChainOrder(p, k+1, j) + 
                        p[i-1]*p[k]*p[j]; 
  
            if (count < min) 
                min = count; 
        }  
        return min; 
    } 

    public static void main(String args[]) 
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
        System.out.println("Minimum number of multiplications is "+ 
                           MatrixChainOrder(arr, 1, n-1)); 
  
    } 
}
