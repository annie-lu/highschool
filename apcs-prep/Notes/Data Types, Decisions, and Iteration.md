[PDF Version](https://docs.google.com/document/d/1mMNRwakCbdr3xWm_WgD1ed8nnvzHWCFEgISdJZZwjAw/edit)

**Identifier**
* a name for a	variable: camelCase
* parameter: camelCase
* constant: CASE
* user-defined method/class: case
* case-sensitive
* has a type associated with it
* introduced with declaration of type

**Type**
* primitive: stored directly
* object: stored as a reference
* can be casted to another compatible type
	* if truncate, must explicitly state/declare

**`int`**
* four bytes
* stored exactly as binary digits (where one digit stores positive/negative sign)
* max value: 231 - 1
* min value: -231

**`double`**
* eight bytes
* are stored in two parts
* mantissa specifies the digits  (one stores the sign)
* exponent
* when converted to binary, there is roundoff error

**`boolean`**
* true or false

**Operators**
* arithmetic `+   -   *   /   %`
  * applied to `int` and `doubles`
  * if involves both, `int` is promoted to `double`
  * *PEMDAS* applies
* relational   `==   !=   >   <   >=   <=`
  * evaluates to true/false
  * generally used for primitive types
	  * use methods such as compareTo and equals for objects
*logical   `!   &&  ||`
  * applied to boolean expressions to compound them
  * short circuit evaluation
	  * stops when has definite value
	    *useful for situations when you don't want to run a method on null:
	    ` if(object==null||object.equals(something)) `
* assignment `= += -+ *= /+ %=`
	* chaining next=prev=sum=0;
	  * evaluates right to left
* increment/decrement `++ --`

**Precedence**

    highest
```
     ! ++ --

      * / %

      + -

     < > <= >=

     == !=

     &&

     ||

     = += -= *= /= %=
```

    lowest


**Control Structures**
* make the statements run in non-sequential order
* Decision Making vs. Iteration

  * **Decision Making**
	* what path
	  * `if` statement
	  * `if else` statement
    * nested `if` statement
	    * `else` gets matched with the closest `if` statement (unless brackets group differently)
	* extended `if` statement
	* `else if` does not exist
	```
	else
	  if ( boolean statement )
	```
  * **Iteration**
    * repeat
      * `for` loop
    
	    ```
    		for (initialization; termination condition; update statement)
	    	statements
	    
	    1. initialize
	    2. terminate condition
	       if false, terminate
	    3. statements
	    4. update statement
	    5. repeat 2-5
	    ```
      * loop variable should not have value changed inside loop body
      * scope of loop variable restricted to loop

    * `for each` loop
    	* “for each element of type SomeType in collection”
    	* can not replace/remove elements
    	* can modify instance fields
	```
		  for (SomeType element: collection)
			  statements
	```
	
    * `while` loop
      * “if evaluates to true, execute, repeat”
	    * statements must somehow lead to termination
    * do while loop
    	* *mr. horn does not recommend*
    * nested loop
