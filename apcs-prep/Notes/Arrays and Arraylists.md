**1D Arrays**
  * a data structure used to implement a list object, where elements are the same type (either primitive or object)

  * *initialization*
    * is an object, must initialize with keyword `new`
    * references can be reassigned

  1. `double[] data = new double[25] `
  2. `double data[] = new double[25] `
  3. `double[] data = {1.0, 5.0, 4.0} `
  4. `double data[];`  `data= new double[25];`

  * *length of an array*
    * final public instance variable 
    * accessed for # of elements

  * *parameters*
    * passes an array as an object reference
    * possible to alter contents in method

**2D Arrays**
  * double[][] data = new double[25][4];
  * double [`int` row] [ `int` column];

**ArrayLists**
* *Pros*
  * does not have final size
  * has methods (such as add())
* *Cons*
  * can not store primitives directly
  * does not make 2D things
  * don't always want expandble list
