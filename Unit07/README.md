# Unit 7 - `ArrayList`

## 7.1 - Introduction to `ArrayList`

arrays are static in size, once initialized, their size cannot be changed
array lists are dynamic in size, the size can change

array lists               vs                arrays
-resizable length                           -fixed length
-part of framework                          -java feature
-not designed to store primitives          -stores primitives

array lists store object references

to use an ArrayList you must import it with
import java.util.ArrayList;

ArrayList<DataType> variableName;

must use the keyword new
new ArrayList<DataType>();
or
new ArrayList<datatype>(n);
n=number of items in array

must use wrapper classes to store primitive values
EX: Boolean, Character, Double, Integer

creating an array list = ArrayList<datatypr> a1= new ArrayList<datatype>();

## 7.2 - `ArrayList` Methods

int size()  returns the num of elements in the list

adding items:
boolean add(E obj)  appends obj to the end of the list, returns true
.add(item)  adds to the end
.add(x,item)  x is the position it will be added

.remove(int index)  removes the item at that index

.get(index)  will get you the item at the index

.set(index, item)  will set whatever is at that index to the item

you can use arraylists with methods
methods can be used to change or access elements in an array list

to return an array list you MUST specify the data type of the elements in the array list
EX:
public static ArrayList<String> methodName(){
    ArrayList<String> arr;
    arr.add("hi");
    return arr;
}

## 7.3 - Traversing `ArrayList`s

traversing using for or a while loop you use .get(i) to get each element in the list
not using [i] like in arrays

in the loops you use arr.size() for the list's size not useing length()

can use enhanced for loops also
-set up is the same as arrays
-makes a copy of each element and wont change the array list even tho the array list is a reference type
-you cannot change or update an array lists with enhanced for loops

## 7.4 - Developing Algorithms Using `ArrayList`s

can make algorithms to get a max or min value of an arraylist

## 7.5 - Searching

## 7.6 - Sorting

## 7.7 - Ethical Issues Around Data Collection
