package Internet;

	import java.math.BigInteger;
	import java.util.*;
	public class hui_su02{     
	    public static  void main(String[] args)  {  
	        System.out.println("请输入一数来开始");
	        Scanner cin = new Scanner(System.in);       
	        while(cin.hasNext()){
	          String n=cin.next();
	          int[][] maze =new int [][] {
	                {2,2,2,2,2,2,2,2,2},  
	                {2,0,0,0,0,0,0,0,2},  
	                {2,0,2,2,0,2,2,0,2},  
	                {2,0,2,0,0,2,0,0,2},  
	                {2,0,2,0,2,0,2,0,2},  
	                {2,0,0,0,0,0,2,0,2},  
	                {2,2,0,2,2,0,2,2,2},  
	                {2,0,0,0,0,0,0,0,2},  
	                {2,2,2,2,2,2,2,2,2}  
	                };   
	             xun(maze,1,1);
	                
	 }
	        cin.close();      
	    }
	    static void xun(int[][] a,int i,int j) {
	               a[i][j]=1; 
	            if(i==7&&j==7)
	            { System.out.println("打印一波：--------------");
	            System.out.println();
	                for(int m=0;m<9;m++) {
	                    for (int n=0;n<9;n++) {
	                        System.out.print(a[m][n]+" ");
	                    }
	                    System.out.println();
	                }
	            }
	            if(a[i][j+1]==0) {
	                  xun(a,i,j+1);
	                }
	            if(a[i+1][j]==0) {
	                    xun(a,i+1,j);    
	            }
	             if(a[i-1][j]==0) {
	                xun(a,i-1,j);    
	            }
	             if(a[i][j-1]==0) {
	                xun(a,i,j-1);    
	            }
	             a[i][j]=0;
	    }
	}

