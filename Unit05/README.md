# Unit 05 - Writing Classes

## 5.1 - Anatomy of a Class

use the class ---> instances of the class-objects
attributes of the objects ---> instance varibles
behaviors of the objects ---> methods

public methods
-no restriction on access
-other classes can access
private methods
-restriction on access
-only access in given class

encapsulation

## 5.2 - Constructors

constructors are always public
name matches the class

default and overloaded constructors

default has empty ()
overloaded has parameters in ()

## 5.3 - Documentation with Comments

//
/*    */

java doc comment(similar to multi line but starts with /**)
/**
*comment
*comment
*/

preconditions=conditions must be true for the method to work

## 5.4 - Accessor Methods

accessor methods allow safe access to instance vars

referred as get methods or getters

returns a copy of private vars

must be public and no parameters

toString method
-returns a string with info about the instance vars
-public String toString()
-always returns a string
-no parameters

## 5.5 - Mutator Methods

allow the change of values for instance vars outside of the class
often referred as set methods or setters
if there is any need for a different class to modify the instance vars, mutator methods are necessary

must be public
retrun type must be void
parameter must match the type of instance var

## 5.6 - Writing Methods

a method header consists of

access level = set by an access modifier: public or private
ownership = set by whether or not static is included
return type = the data type of the value returned by the method, can be primitive, reference or void
parameter list = enclosed in parentheses, states the data type and identifier for each parameter used in the method

## 5.7 - Static Variables and Methods

static methods are associated with the class, not objects of the class

static methods cannot access or change the values of instance vars

static methods can access or change the values of static vars

static vars are used with the class name and the dot operator, since they are associated with a class, not objects of a class

## 5.8 - Scope and Access

if u redeclare vars in a method or constructor it is a new local var instead of using a private or public var
EX: private int num but then in a method or constructor declaring int num makes these 2 different vars

local vars cannot be private or public

## 5.9 - `this` Keyword

this is needed when wanting an instance var thats the same as a local var
EX: this.dog=dog;
-this.dog is the private var while dog is the local var

within a non static method or a constructor the keyword this is a reference to the current object-the object whose method or constructor is being called

the keyword this can be used to pass the current object as an actual parameter in a method call

## 5.10 - Ethical and Social Implications of Computing Systems
