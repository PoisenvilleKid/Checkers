import java. util.*;
import static java.lang.System.*;


public class Matrix {
private int fred = 0;


    public Matrix() 
    {
    	fred =((int)(Math.random()*2));
    }
    public int getNum()
    {
    	return fred;
    }
    public String toString()
    {
    	return  fred+ " ";
     }
    
    
}