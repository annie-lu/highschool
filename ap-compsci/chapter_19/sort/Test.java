package sort;

import java.util.Arrays;

/**
 * Used to test each of the sort methods provided on a
 * Integer[] of random numbers. */
public class Test
{
	public static void main(String[] args)
	{
		testSortInteger();
	}
	
    /**
     * Tests the specified sort method on an array of
     * 10 random ints such that each element e is:
     * 0 <= e < 100.
     * 
     * Displays the array before and after sorting using
     * the specified algorithm.
     * 
     * algorithm:
     *      0 - java.util.Arrays.sort()
     *      1 - SelectionSort.sort()
     *      2 - InsertionSort.sort()
     *      -2 - InsertionSort.sortWithBinarySearch()
     *      3 - MergeSort.sort()
     *      
     * @param algorithm the algorithm to be used for the sort, as described above.
     */
    public static void testSortInteger(int algorithm)
    {
        Integer[] a = new Integer[10];
        IntegerComparator c = new IntegerComparator();
     
        for(int i = 0; i < a.length; i++)
        	a[i] = (int) (Math.random() * 100);
        
        System.out.print("a[]: ");
        System.out.println(Arrays.toString(a));
        
        switch(algorithm)
        {
            case 0:
                System.out.println("java.util.Arrays.sort(a,c)");
                java.util.Arrays.sort(a,c);
                break;
            
            case 1:
                System.out.println("SelectionSort.sort(a,c)");
                SelectionSort.sort(a,c);
                break;
            
            case 2:
                System.out.println("InsertionSort.sort(a,c)");
                InsertionSort.sort(a,c);
                break;
            
            case -2:
                System.out.println("InsertionSort.sortWithBinarySearch(a,c)");
                InsertionSort.sortWithBinarySearch(a,c);
                break;
                
            case 3:
                System.out.println("MergeSort.sort(a,c)");
                MergeSort.sort(a,c);
                break;
        }
        
        System.out.print("a[]: ");
        System.out.println(Arrays.toString(a));
    }
}
