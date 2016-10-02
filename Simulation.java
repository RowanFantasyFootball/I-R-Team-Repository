
/**
 * Write a description of class Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulation
{
    // instance variables - replace the example below with your own
    private Field field;
    private Controller controller;

    /**
     * Constructor for objects of class Simulation
     */
    public Simulation(int depth, int width)
    {
        field = new Field(depth, width);
        controller = new Controller();
    }

    
}
