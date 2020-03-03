import java.util.*;
public class Multiply_iter {

         static int N = 8;
        static void multiply(int mat1[][], int mat2[][], int res[][])
        {
            int i, j, k;
            // int N=mat1.length;
            for (i = 0; i < N; i++)
            {
                for (j = 0; j < N; j++)
                {
                    res[i][j] = 0;
                    for (k = 0; k < N; k++)
                        res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        public static void main (String[] args)
        {
            int mat1[][] = { {11,2 ,3, 4, -15, 6 ,17, 8},
                           {3 ,-7 ,16 ,5 ,14 ,3 ,22 ,1},
                    {22 ,3 ,6 ,25, 24 ,23 ,12 ,3},
                    {7 ,6 ,35 ,4 ,23 ,2 ,-11, 22},
                    {25 ,6 ,7 ,28 ,11 ,-12, 3 ,4},
                   {6 ,-15, 8 ,7 ,24, 3 ,23, -4},
                    {-11 ,2 ,2 ,-11 ,5 ,6 ,27 ,18},
                   {12 ,7 ,24 ,15 ,6 ,17 ,8 ,-19}};



            int mat2[][] = { {5 ,12, 8, -11 ,4 ,18, 6 ,2},
                       {-23 ,15 ,9 ,7 ,22 ,11 ,14 ,16},
                    {-5 ,-18 ,23 ,28 ,-34 ,24 ,6 ,9},
                    {7 ,14 ,11 ,6 ,9, -4, -7 ,6},
                    {4 ,5 ,-6 ,-7, 8 ,9 ,10 ,-11},
                    {12 ,-13, 14 ,15 ,16 ,-17, 18, 19},
                    {-20 ,21 ,22 ,-23, 24 ,-25, 26, 27},
                    {4 ,3 ,2 ,1 ,9 ,8 ,7 ,6}};
                
            int N=mat1.length; 
            int res[][] = new int[N][N] ;

            int i, j;

            multiply(mat1, mat2, res);



            System.out.println("Result matrix"

                    + " is ");

            for (i = 0; i < N; i++)

            {

                for (j = 0; j < N; j++)

                    System.out.print( res[i][j]

                            + " ");

                System.out.println();

            }

        }

    }
