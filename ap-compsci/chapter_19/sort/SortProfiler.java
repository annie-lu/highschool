package sort;

public class SortProfiler 
{
	public static void main(String[] args)
	{
		
		int currentNum = 1; 
		
		
		for (int index = 0; index < 8; index++)
		{
			currentNum *= 10;
			int[] x = createRandomArray(currentNum);
			int[] y = new int[currentNum]; 
			int[] z = new int[currentNum];;
			System.arraycopy(x, 0, y, 0, currentNum);
			System.arraycopy(x, 0, z, 0, currentNum);

			System.out.println((index+1)+": "+currentNum+" elements");
	
			
			
			double start = System.currentTimeMillis();
			InsertionSort.sort(x);
			System.out.println("Insertion Time: "+ (System.currentTimeMillis() - start));
			
			
			start = System.currentTimeMillis();
			MergeSort.sort(y);
			System.out.println("Merge Time: "+(System.currentTimeMillis() - start));
			
			start = System.currentTimeMillis();
			SelectionSort.sort(z);
			System.out.println("Selection Time: "+(System.currentTimeMillis() - start));
		
			System.out.println("");
		}
		
	
		
	}
	
	public static int[] createRandomArray(int numOfElements)
	{
		int[] numArray = new int[numOfElements];
		
		for (int x = 0; x < numOfElements; x++)
		{
			numArray[x] = (int) (Math.random()*100);
		}
		
		return numArray;
	}
	
	}
	

