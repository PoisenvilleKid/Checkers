import javax.swing.JFrame;


public class CheckerBoardRunner  extends JFrame{
	
	private static final int WIDTH = 815;
	private static final int HEIGHT = 830;


    public CheckerBoardRunner() 
    {
    	super("Board");

		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new Board());
		//add(new CheckerPiece());
		setVisible(true);
    }
    
    public static void main( String args[] )
	{
		CheckerBoardRunner run = new CheckerBoardRunner();
	}
    
    
}