package p10_12;

public class RootApproximator
{
    private double a;
    private double x0;
    private double x1;
    
    public RootApproximator(double aNumber)
    {
        a = aNumber;
        x1 = aNumber;
    }
    
    public void nextGuess()
    {
        
        x0 = (x1 + a / x1) / 2;
        x1 = x0; //write this  after the x0 is initialized?
        //dont return anything??
    }
    
    public double getRoot()
    {
        while(!Numeric.approxEqual(x0, x1))
            nextGuess();
        return x1;
    }

}
