import java.util.*;
import static java.lang.System.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class Board extends JPanel {
private int [][] fred = new int [8][8];
private int x = 100;
private int y = 100;
private int size = 100;

    public Board() 
    {
    	setBackground(Color.WHITE);
    	
    }
    public void paint( Graphics window )
    {
    	paintBoard(window);
    }
     public void paintBoard( Graphics window )
    {
    	for(int row = 0; row<8; row++)
    	{
    	
    		for(int column = 0; column<8; column++)
    		{
    			if((row%2) != (column%2))
    			{
    				fred[row][column] = 0;
    				window.setColor(Color.BLACK);
    	            window.fillRect(y*row,y*column,size,size);
    			}
    			else
    			{
    				fred[row][column] = 1;
    				window.setColor(Color.RED);
    	            window.fillRect(y*row,y*column,size,size);
    			}
    			
    		}
    	}
    }
   
    
    
}