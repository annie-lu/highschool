package sort;

public class InsertionSort
{
    public static void sort(int[] x)
    {
		
    	for (int start = 1; start < x.length; start++) 
		{
			int insert = x[start];
			int index = start-1;
			
			while(index >= 0 && insert < x[index])
			{
					x[index+1] =  x[index];
					x[index] = insert;
					index--;
			}
					
		}
	}

    
    
    public static void recursiveSort(int[] x)
    {
        sort(x,1);
    }

    public static void sortWithBinarySearch(int[] x)
    {
    
    }

    public static int binarySearch(int[] x, int key)
    {
    	return binarySearch(x, key, 0, x.length-1);
    }

    private static int binarySearch(int[] x, int key, int start, int end)
    {
    	if (start > end)
    	    return -start - 1;
    	
        int mid=(start+end)/2;
        
        if(key==x[mid])
        	return mid;
       
        if(key<x[mid])
        return binarySearch(x,key,start,mid-1); //mid minus 1 ew
        else 
        return binarySearch(x,key,mid+1,x.length);
    }

    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
        if(start==x.length)
        	return;
        
        int insert = x[start];
		int index = start-1;
	
		//change to insert (which is recursive)
		while(index>=0&&insert<x[index])
		{
				int temp = x[index];
				x[index+1] = temp;
				x[index] = insert;
				index--;
		}
		sort(x,start+1);
        
    }

    // inserts value into correct position in x[0]...x[start]
    private static void insert(int[] x, int value, int start)
    {
        
    }
}
