package multigrid;

import java.util.*;
import info.gridworld.grid.*;

public class MultiGrid //extends BoundedGrid
{
	private ArrayList<String>[][] list;
	public MultiGrid(int rows,int cols)
	{
		list = new ArrayList<String>[rows][cols];
	}

}
