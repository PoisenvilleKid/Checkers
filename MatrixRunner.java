import java.util.*;
import static java.lang.System.*;

public class MatrixRunner {
  
    
    public MatrixRunner() {
    }
    
    
    public static void main(String[] args) 
    {
    	// set up and print first matrix
    	out.println("    First Matrix     ");//prints out new matrix
    	int[][] Fred  = new int[10][10];//sets up 10x10 matrix
    	{
    		for(int row = 0; row<10; row++)//sets up how many in each row
    		{
    			out.println();//sets new line
    			for(int column = 0; column<10; column++) //sets how many are in each column
    			{
    				Fred[row][column] = ((int)(Math.random()*2));//puts 1 or 0 in each 
    			    out.print(Fred[row][column]+ " ");//prints matrix
    			}
    		}
    		
    	}
    	
    	out.println("\n"+"   Seconed Matrix    ");
    	int count1 = 0;
    	int[][] Jed = new int [12][12];
    	
    	//Count adjacent 1's and place in Jed
    	for(int row1 = 1; row1<10; row1++)
    	{
    		for(int column1 = 1; column1<10; column1++)
    		  {
    			for(int row3 = row1-1; row3<=row1+1; row3++)
    			{
    				for(int column3 = column1-1; column3<=column1+1; column3++)
    				{
    					Jed[row3][column3] += Fred[row1][column1];
    				}
    			}
    			
    		  }
    		}
    	
    	//print new matrix
    	for(int row2 = 0; row2<10; row2++)
    	{
    		out.println();
    		for(int column2 = 0; column2<10; column2++)
    		{
    			out.print(Jed[row2][column2]+ " ");
    		}
    	}
    	
        
    }
}
