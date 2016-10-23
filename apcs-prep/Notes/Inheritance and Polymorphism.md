[PDF version](https://docs.google.com/document/d/1s-n-f4mCyqmCSZXFX5N2SPoIvv_OhwaVoNd_GJo6uJw/edit?usp=sharing)

####**Inheritance**
* defines a relationship between objects that share characteristics

####**Subclass extends Superclass**
* inherits characteristics (variables and methods) of superclass
* can not directly access anything private
* can override superclass methods by defining a method with same
	 * name
	 * return type
	 * parameters
* can partial override methods by defining a method with
* call to super.method();
	 * additional statements
* if subclass has no constructor, generates superclass default constructor
  * if none, compile time error
* can call super() in constructor
  * if and only if its the first line
* more rules on page 133 of barrons book
* can have a superclass reference for a subclass object


####**Polymorphism**
* selecting the appropriate method for a particular object in class hierarchy
* dynamic binding
	 * run time decision of which instance method to call
* ex:
```
Superclass a = new Subclass( );
a.method(b);
```
* at *compile time*
  * reference a must have method called
  * b must be the correct type
* at *runtime*
  * actual object’s method will be called

####**Abstract Classes vs. Interfaces**

**Abstract Classes**
* can not be instantiated
* an object is application specific, but incomplete without subclass
* classes *extend* abstract classes
* some implementation
* can have constructors, instance variables, public static fields, constants
* a class
* abstract methods must be declared abstract
* does not necessarily have to have abstract methods

**Interfaces**
* can not be instantiated
* methods are equally applicable in variety of programs
* classes *implement* interfaces
* no implementation
* can have public static fields, constants
* all methods are public and abstract
	* no need to explicitly state


