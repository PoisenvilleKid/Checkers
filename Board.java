import java.util.*;
import static java.lang.System.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class Board extends JPanel implements MouseListener {
private static final long serialVersionUID = 1L;
public int[][] CheckerBoard = new int[8][8];
public int[][] CheckerPieces = new int[8][8];
private int size = 100;


    public Board() 
    {
    	setBackground(Color.WHITE); // Establish Window
    	addMouseListener(this);
	}
	
	// Paint Initial Board
    public void paint( Graphics window )
    {
    	InitialPaintBoard(window);
	}
	
	// After Every Move Paint The Board
	public void update(Graphics window)
	{

	}
     public void InitialPaintBoard( Graphics window )
    {
		// Fills The Board With Pieces
    	for(int row = 0; row<8; row++)
    	{
    		for(int column = 0; column<8; column++)
    		{
				if ((row % 2) != (column % 2))
				{
    				CheckerBoard[row][column] = 0;
    				window.setColor(Color.BLACK);
					window.fillRect(size*row,size*column,size,size);
					if(column > 4)
					{
						CheckerPieces[row][column] = 0;
						window.setColor(Color.RED);
    	           	    window.fillOval(((size*row)+25),((size*column)+25),50,50);
					}
    			}
    			else
				{
    				CheckerBoard[row][column] = 1;
    				window.setColor(Color.RED);
					window.fillRect(size*row,size*column,size,size);
					if(column < 3)
					{
						CheckerPieces[row][column] = 1;
						window.setColor(Color.BLACK);
    	           	    window.fillOval(((size*row)+25),((size*column)+25),50,50);
					}
    			}
    			
    		}
    	}
    }
   
    
    
}