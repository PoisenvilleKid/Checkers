import java.util.*;
import static java.lang.System.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class CheckerPiece extends JPanel {
private static final long serialVersionUID = 1L;
private int[][] fred = new int[8][8];
private int [][] fred1 = new int [8][8];
private int x = 100;
private int y = 100;

    public CheckerPiece() 
    {
    	
    }
    public void paint( Graphics window )
    {
    	//paintPieces(window);
    }
    public void paintPieces(Graphics window)
    {
    	for(int row = 0; row<8; row++)
    	{
    		for(int column = 0; column <3; column++)
    		{
    			if((row%2) != (column%2))
    			{
    				fred[row][column] = 0;
    				window.setColor(Color.WHITE);
    	            window.fillOval(((x*row)+25),((y*column)+25),50,50);
    			}
    			
    		}
    	}
    	
    	
    
    	
    
    }   	  
    
    
}