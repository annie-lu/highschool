[PDF Version](https://docs.google.com/document/d/1_jEPrGWW237XGuPfvL_u0Obt4aYVObpBD1pnmIVskGQ/edit?usp=sharing)

**Objects**
* a single instance of a class 
* an idea represented as an object reference
* characterized by its
  * state
	  * instance variables
  * behavior
	  * methods

**Classes**
* a software blueprint for implementing objects
* maintains state and provides behavior
* contains	
  * instance fields
  * constructor
  * accessor/ mutator methods

**Keywords** (access specifiers)
* `public`
  * usable by all client programs
* `private`
  * only accessed by some (ex: package)
* `static`
  * shared by all instances
* `final` (variables)
  * can not be changed

**Methods**
* Headers
  * access specifier | return type | method name | parameter list
* Constructors
  * creates an object of a class
  * always same name as class
	* default
	  * has no arguments
	  * provides reasonable initial values (`0`, `null`, `false`, etc.)
	* with parameters
	  * sets instance variables using arguments
* Accessors
	* accesses class object without altering
	* suppose to return info of object
	* usually has no parameters
* Mutators
	* modifies at least one instance field
	* doesn’t usually return anything
	* usually has parameters

**Static Class**
* performs operation on entire class, not individual object
* can’t call instance method
* can use static variables
* ex: `Math` class
* (usually) does not create any objects
* when declared, has no implicit parameter (no object)

**References and Variables**
* stored as an address (reference) in memory of object

* aliasing
  * can have multiple references to same object
  * based on: scope
* scope of a variable or method
  * the region it can be accessed
  * Hierarchy
```
CLASS
  instance fields
  static variables
METHODS
  BLOCK
  local variable
```
  * local variables take precedence over instance variables
	* unless you use the implicit parameter `this`
	
* parameters
	* information passed to the program
	* formal parameters are placeholders for actual parameters called arguments
	* there are explicit parameters and one implicit parameter (the object)
	* parameters are passed by value
	* any changes made to the parameters will NOT affect the values of the arguments called

methods can’t change object referenced

but can change state
