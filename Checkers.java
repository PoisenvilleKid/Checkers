import java.util.*;
import static java.lang.System.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;
import javax.swing.JPanel;




public class Checkers extends JPanel implements MouseListener {
private static final long serialVersionUID = 1L;
private int x = 100;
private int y = 100;
private int mouseX;
private int mouseY;
private int mousebutton;
private int Col = 0;
private int Row = 0;
private int count = 0;

private int [][] fred = 
{{0,1,0,1,0,1,0,1},
 {1,0,1,0,1,0,1,0},
 {0,1,0,1,0,1,0,1},
 {1,0,1,0,1,0,1,0},
 {0,1,0,1,0,1,0,1},
 {1,0,1,0,1,0,1,0},
 {0,1,0,1,0,1,0,1},
 {1,0,1,0,1,0,1,0}};


private int [][] fred1 = 
		{{0,1,0,0,0,2,0,2},
    	{1,0,1,0,0,0,2,0},
    	{0,1,0,0,0,2,0,2},
    	{1,0,1,0,0,0,2,0},
    	{0,1,0,0,0,2,0,2},
    	{1,0,1,0,0,0,2,0},
    	{0,1,0,0,0,2,0,2},
    	{1,0,1,0,0,0,2,0}};
private int size;

    public Checkers() {
    	setBackground(Color.WHITE);
    	mousebutton = 0;
    	addMouseListener(this);
    	size = 100;
    }
    
    public void origBoard()
    {
    	int[][]fred3 = {{0,1,0,1,0,1,0,1},
 		{1,0,1,0,1,0,1,0},
 		{0,1,0,1,0,1,0,1},
 		{1,0,1,0,1,0,1,0},
 		{0,1,0,1,0,1,0,1},
 		{1,0,1,0,1,0,1,0},
 		{0,1,0,1,0,1,0,1},
		{1,0,1,0,1,0,1,0}};
    }
    
    
	public void paint(Graphics window)
	{
		paintBoard(window);
		paintPieces(window);
	}
	
	public void mouseClick(MouseEvent e)
	{
		for(int i = 0; i<fred.length; i++)
		{
			System.out.println();
			for(int j  = 0; j<fred.length; j++)
			{
				System.out.print(fred[i][j]);
			}
			
		}
	}
	
    public void paintPieces( Graphics window )
    {
    	for(int r = 0; r<fred.length; r++)
    	{
    		for(int c = 0; c<fred.length; c++)
    		{
    			if(fred1[r][c] == 1)
    			{
    				window.setColor(Color.BLACK);
    				window.fillOval(((x*r)+20),((y*c)+20),size/2,size/2);
    			}
    			else if(fred1[r][c] == 2)
    			{
    				
    				window.setColor(Color.WHITE);
    			    window.fillOval(((x*r)+20),((y*c)+20),size/2,size/2);
    				
    			}
    			else
    			{
    				if(fred1[r][c] == 3)
    				{
    					window.setColor(Color.BLUE);
    					window.fillOval(((x*r)+20),((y*c)+20),size/2,size/2);
    				}
    			}
    		}
    	}
    	
    }
    public void paintBoard( Graphics window )
    {
    	for(int r = 0; r<fred.length; r++)
    	{
    	
    		for(int c = 0; c<fred.length; c++)
    		{
    			if(fred[r][c] == 0)
    			{
    				window.setColor(Color.BLACK);
    				window.fillRect(y*r,y*c,size,size);
    			}
    			else if(fred[r][c] == 1)
    			{
    				
    				window.setColor(Color.RED);
    				window.fillRect(y*r,y*c,size,size);
    			
    				
    			}
    			else
    			{
    				if(fred[r][c] == 2)
    				{
    					window.setColor(Color.BLUE);
    					window.fillRect(y*r,y*c,size,size);
    					
    				}
    			}
    			
    		}
    	}
    	
    }
    
    	public void checkIt()
    	{
    		for(int row = 0; row<8; row++)
    		{
    			System.out.println();
    			for(int column = 0; column<8; column++)
    			{
    				System.out.print(fred1[row][column]);
    			}
    		}
    	}
    public void mouseClicked(MouseEvent e)
	{   
		mouseX=e.getX();
		mouseY=e.getY();
		mousebutton = e.getButton();

		Col = e.getX()/(830/8);
    	Row = e.getY()/(815/8);
    	ArrayList<Integer> Cord = new ArrayList<Integer>();
    	Cord.add(Row);
    	Cord.add(Col);
    	System.out.println(Cord);
    	count++;
    	System.out.println(count);
    	if(fred1[Col][Row] == 2 && Col>0 && Col<7 && fred1[Col+1][Row-1] == 0 && fred1[Col-1][Row-1] == 0 && count == 1)
    	{
    		
    		fred[Col+1][Row-1] = 2;
    		fred[Col-1][Row-1] = 2;
    		repaint();
    	}
    	if(fred1[Col][Row] == 2 && Col == 0 && fred1[Col+1][Row-1] == 0)
    	{
    		count++;
    		fred[Col+1][Row-1] = 2;
    		count = 0;
    		repaint();
    	}
        if(count == 2 && Col  > 0 )
        {
        	fred[Cord.get(1)+1][Cord.get(0)-1] = 1;
        	fred[Cord.get(1)-1][Cord.get(0)-1] = 1;
    		repaint();
    		count = 0;
        }
        if(count == 2 && Col  ==  0 )
        {
        	fred[Cord.get(1)+1][Cord.get(0)-1] = 1;
        	repaint();
    		count = 0;
        }
       	  	
	}
    	public void repaint(Graphics window)
    	{
    	 paint(window);
    	}
    	
    	
    	public void mouseEntered(MouseEvent e) { }
		public void mouseExited(MouseEvent e) { }
		public void mousePressed(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
    	
}
    
    
    
    
