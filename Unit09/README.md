# Unit 9 - Inheritance

## 9.1 - Creating Superclasses and Subclasses

in java we use inheritance to build a hierarchy of classes that have similar characteristics

why we use inheritance
-code reusability
-prevents repeating code
-readability and organization
-ease of maintenance

superclasses and subclasses

ex: dancer is a subclass of the performer superclass
ex: dancer is a performer

use extends to make a subclass

ex: public class musician extends performer{
    ////
}

the extends allows the subclass to inherit all methods and attributes of the superclass 

## 9.2 - Writing Constructors for Subclasses

constuctors are not inherited

java inserts super(); automatically into constructors of subclasses if u dont and will go to the default no argument constructor
-must be first line of constructor of the subclass
-use super(); to connect certain subclass items to constuctors in the superclass
-superclasses must have a constructor

## 9.3 - Overriding Methods

override methods: a new and different implementation of a method that already exists in the superclass

the method in the subclass with the same name as one in the superclass will override the superclass one

## 9.4 - super Keyword

use super.method(); to call superclass methods that are overrided

ex: super.perform();

## 9.5 - Creating References Using Inheritance Hierarchies

## 9.6 - Polymorphism

## 9.7 - Object Superclass
