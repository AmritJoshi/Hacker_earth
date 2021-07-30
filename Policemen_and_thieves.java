/*
Problem

You are given a grid of size

that has the following specifications:

    Each cell in the grid contains either a policeman or a thief.
    A policeman can only catch a thief if both of them are in the same row.
    Each policeman can only catch one thief.
    A policeman cannot catch a thief who is more than K units away from the policeman.

Write a program to find the maximum number of thieves that can be caught in the grid.

Input format

    First line: T (number of test cases)
    For each test case
    First line: Two space-separated integers N and K
    Next N lines: N space-separated characters (denoting each cell in the grid)

Output format

For each test case, print the maximum number of thieves that can be caught in the grid.

Constraints



Sample Input

1
3 1
P T P
T P T
T T P

Sample Output

3

Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation

Total Thieves = 5
Number of thieves reachable by policemen in Row 1 = 1
Number of thieves reachable by policemen in Row 2 = 2
Number of thieves reachable by policemen in Row 3 = 1
However, one policeman can catch at most 1 thief. Hence, in Row 2, only 1 thief is catchable.
Therefore, the 3 thieves can be caught.
*/

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }

            int out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int solution(char[][] A, int K){
        // Write your code here
        int ans=0;
       for(int i=0;i<A.length;i++){
           for(int j=0;j<A[0].length;j++){
               if(A[i][j]=='P'){
                   int minn=Math.max(0,j-K);
                   int maxx=Math.min(A[0].length-1,j+K);

                   for(int k=minn;k<=maxx;k++){
                       if(A[i][k]=='T'){
                           A[i][k]='C';
                            ++ans;
                            break;
                       }
                   }
               }

           }
       }
       return ans;
    }
}
