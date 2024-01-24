# 2.9 Using the Math Class

math class methods are static
math is a class library (like c++ but not used the same)

to import math:
java.lang.Math (allows u not to have to always do Math.)
can just do Math.

abs(int x)
abs(double x)
pow(double base, double exp)
sqrt(double x)
random()
-same as c++ except random but has Math. in front

Math.random()
-returns a num between 0.0 and 1.0
-can return 0.0 but not 1.0
-no parameters
-is a double
-cast to int after movning decimal place by multiplying
-then use addition to change range
-addition is used to select the lowest value possible

EX:
(int)(Math.random()*(max-min+1))-min;
-this gets the range to be from the min to the max
