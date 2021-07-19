//
//package com.customException;
//
//import java.io.*;
//
//public class circularMatrix {
//  public static void main(String a[]) throws IOException
//  {
//	   
//	    System.out.print("Enter Number ");
//	    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//	    int n = Integer.parseInt(reader.readLine());
//	      int A[][]= new int[n][n] ;
//	      int rs=0,cs=0,re=n-1,ce=n-1,it=1;
//	      it=n*n;
//	      for(int k=it;k>=1;k--)
//	      {
//	         //right
//	          for(int i=cs;i<=ce;i++)
//	          {
//	              A[rs][i]=it--;
//	          }
//	          //down
//	          for(int j=rs+1;j<=re;j++)
//	          {
//	              A[j][ce]=it--;
//	          }
//	          //left
//	          for(int i=ce-1;i>=cs;i--)
//	          {
//	              A[re][i]=it--;
//	          }
//	          //up
//	          for(int j=re-1;j>=rs+1;j--)
//	          {
//	              A[j][cs]=it--;
//	          }
//	          rs++;re--;cs++;ce--;
//	      }
//	     for(int i=0; i<n; i++)
//	      {
//	        for(int j=0;j<n;j++)
//	        {
//	        	System.out.print(A[i][j]+"\t");
//
//	          
//	        }
//	        System.out.print("\n");
//	           }
//	  
//  }
//}
