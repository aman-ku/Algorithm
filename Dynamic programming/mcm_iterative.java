import java.util.Scanner;
class mcm_iterative
{
    static int multiply(int p[],int n)
    {
      int m[][]= new int[n][n];
      int i,j,k,l,q;  
      for( i=1;i<n;i++)
      {
          m[i][i]=0;
      }
      for(l=2;l<n;l++)
      {
          for(i=1;i<n-l+1;i++)
          {
              j=i-l+1;
              m[i][j]=Integer.MAX_VALUE;

              for(k=i;k<=j-1;k++)
              {
                  q= m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                  if(q<m[i][j])
                  {
                      m[i][j]=q;
                  }
              }
          }
      }
      return m[1][n-1];
    }
   

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Entern number of matrices\n");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter dimensions\n");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int size= arr.length;
        System.out.println("Minimum number of multiplication is "+multiply(arr,size));
    }
}