package matrixManipulator;

public class MatrixManipulator
{
  public static boolean addable(int[][] first, int[][] second)
  {
    if (!(atLeastOneByOne(first) && atLeastOneByOne(second)))
      return false;
    else
    	return (first.length == second.length && first[0].length == second[0].length);
  }

  public static int[][] add(int[][] first, int[][] second)
  {
    if (addable(first, second)){
    	 int[][] sum = new int[first.length][first[0].length];

    	    for (int row = 0; row < sum.length; row++)
    	      for (int column = 0; column < sum[0].length; column++)
    	        sum[row][column] = first[row][column] + second[row][column];

    	    return sum;
    }
    else
    	throw new IllegalArgumentException();

   
  }

  public static int[][] multiplyByScalar(int scalar, int[][] matrix)
  {
    if (atLeastOneByOne(matrix)){
    	 int[][] scalarProduct = new int[matrix.length][matrix[0].length];
    	   
    	    for (int row = 0; row < scalarProduct.length; row++)
    	      for (int column = 0; column < scalarProduct[0].length; column++)
    	        scalarProduct[row][column] = matrix[row][column] * scalar;

    	    return scalarProduct;
    }
      throw new IllegalArgumentException();

  }

  public static boolean multipliable(int[][] first, int[][] second)
  {
    if (atLeastOneByOne(first) && atLeastOneByOne(second))
    	 return first[0].length == second.length;
    else
      return false;

   
  }

  public static int[][] multiply(int[][] first, int[][] second)
  {
    if (multipliable(first, second)){
    	  int[][] product = new int[first.length][second[0].length];
    	    for (int row = 0; row < product.length; row++)
    	      for (int column = 0; column < product[0].length; column++)
    	        product[row][column] = multiply(first, row, second, column);

    	    return product;
    }
      throw new IllegalArgumentException();
  }

  public static int multiply(int[][] first, int row, int[][] second, int column)
  {
    if (atLeastOneByOne(first) && atLeastOneByOne(second)){
    	 if (first[row].length != second.length)
    	      throw new IllegalArgumentException();

    	    int product = 0;

    	    for (int x = 0; x< first[row].length; x++)
    	      product += first[row][x] * second[x][column];

    	    return product;
    }
      throw new IllegalArgumentException();

   
  }

  private static boolean atLeastOneByOne(int[][] matrix)
  {
    return matrix != null && matrix.length > 0 && matrix[0].length > 0;
  }
}
