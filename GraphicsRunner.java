import javax.swing.JFrame;

public class GraphicsRunner extends JFrame  
{
	private static final int WIDTH = 815;
	private static final int HEIGHT = 830;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
		getContentPane().add(new Checkers());
		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
	
}