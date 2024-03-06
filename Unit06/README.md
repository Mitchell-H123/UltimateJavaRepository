# Unit 6 - Array

## 6.1 - Array Creation and Access

an element is a single val of an array

length is a public final data member of an array

int [] listOne = new int[5];
listOne[2]=33;
-declaring an array is very different from c++ but assigning values are the same

can declare an array mutable
Mutable [] listTwo;
listTwo = new Mutable(33);
-this initializes all elements to null

can use an initializer in creating an array
double [] grades = {70.4, 432.5, 13.7532};

## 6.2 - Traversing Arrays

traversing an array means to access each element of an array

arrays can be private in a class

## 6.3 - Enhanced for Loop for Arrays

enhanced for loop:
for(type declaration : structure){
    statements
}

enchanced for loops will go through an array and can print all values in an array
-can use with any type of array

usually looks like:
for(int num:list){
    System.out.print(num);
}
-this will print all ints in list

in the for loop use a : not ; like normal ones

## 6.4 - Developing Algorithms Using Arrays

developing algorithms usually need a loop to go through the array and local vars to hold certain values
-ex max, min, average, shifting