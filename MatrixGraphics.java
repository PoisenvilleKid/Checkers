import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;





public  class MatrixGraphics extends Canvas  implements MouseListener {
private Color[] FredColor = {Color.LIGHT_GRAY,Color.PINK,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.MAGENTA,Color.ORANGE,Color.RED,Color.RED};
private int M = 10;//Max size
private int T = 2;//test size
private int x = 80;//x
private int y = 55;//y
private int mouseX;
private int mousebutton;



    public MatrixGraphics() 
    {
    	setBackground(Color.BLACK);//set Background
    	int Value = (int)(Math.random()*2);
    	mousebutton = 0;
    	addMouseListener(this);
    	
    
    	
    }
    public void mouseClicked(MouseEvent e)
	{
		mouseX=e.getX();
		mousebutton = e.getButton();
		System.out.print(e.getX()+ " ");
		System.out.println("Mouse Clicked");
		
	}
    
    public void paint( Graphics window )
    {
    	
    	//Difficulty Buttons
    	window.setColor(Color.GREEN);
    	window.fillRect(600,50,100,50);
    	window.setColor(Color.BLACK);
    	window.drawString("Novice",635,80);
    	window.setColor(Color.YELLOW);
    	window.fillRect(600,200,100,50);
    	window.setColor(Color.BLACK);
    	window.drawString("Intermediate",620,230);
    	window.setColor(Color.RED);
    	window.fillRect(600,350,100,50);
    	window.setColor(Color.BLACK);
    	window.drawString("Master",635,380);
    	
    	
    	
    	//first matrix
    	int[][] Fred  = new int[M][M];
    	for(int row = 0; row<M; row++)
    	{
    		System.out.println();
    		for(int column = 0; column<M; column++)
    		{
    			Fred[row][column] = ((int)(Math.random()*2));
    	        //window.fillRect(80*row,60*column,50,50);
    		}
    	}
    	//adjacent matrix
    	int[][] Jed = new int [12][12];
    	
    	//Count adjacent 1's and place in Jed
    	for(int row2 = 1; row2<10; row2++)
    	{
    		for(int column2 = 1; column2<10; column2++)
    		  {
    			for(int row3 = row2-1; row3<=row2+1; row3++)
    			{
    				for(int column3 = column2-1; column3<=column2+1; column3++)
    				{
    					Jed[row3][column3] += Fred[row2][column2];
    				}
    			}
    			
    		  }
    	}
    	//clickable squares
    	for(int row1 = 0; row1<M; row1++)
    	{
    		for(int column1=0; column1<M; column1++)
    		{
    			if(Jed[row1][column1] == 0)
    			{
    				window.setColor(Color.LIGHT_GRAY);
    	            window.fillRect(y*row1,y*column1,50,50);
    	            window.setColor(Color.GRAY);
    	            window.drawString(Jed[row1][column1]+" ",((y*row1)+25),((y*column1)+25));
    			}
    			else
    			{
    				window.setColor(FredColor[Jed[row1][column1]]);
    				window.fillRect(y*row1, y*column1,50,50);
    				window.setColor(Color.GRAY);
    	            window.drawString(Jed[row1][column1]+" ",((y*row1)+25),((y*column1)+25));
    			}
    			
    		}
    	}
    }
    public void removeTile (Graphics window)
    {
    	if((mousebutton==MouseEvent.BUTTON1))
    	{
    		for(int row4 = 0; row4<M; row4++)
    	{
    		for(int column4 = 0; column4<M; column4++)
    		{
    			    window.setColor(Color.WHITE);
    	            window.fillRect(y*row4,y*column4,50,50);
    		}
    	}
    	}
    }
    
    public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
    
    
    
}