package wrestler;

import java.util.ListIterator;

import numbers.Number;

public class Wrestler {
	String name;
	int weight;
	
	/**

     * Constructor for objects of class Wrestler

     */

    public Wrestler( String theName, int theWeight)
    {

        name= theName;
        weight=theWeight;

    }
    

    

    public int getWeight()
    {

        return weight;

    }

    

    public String getName()
    {

        return name;

    }

    public String toString(){
    	return name+" "+weight;
    }
   

    
}
