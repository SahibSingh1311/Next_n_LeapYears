# Next_n_LeapYears
Java program to find the next n leap years after a particular year.

This program takes in consideration whether the current year is a leap year or not and the find the next 'n' leap years from a particular current years.
Lets say user gave an input of 2006, which is not a leap year, and wants to find the next (n=)5 leap years, so the logic of while loop si built in such a way that untill we find the next leap year from the given current year, the increment will be 1 to the current year, but as soon as we find the leap year, 4 is increment on each iteration. 
P.S. Each time the year is incremented by either 1 or 4, it is verified that the year is a leap or not so as to avoid years such as 2100, 2200, 2300 but not 2400. 

So in the first iteration of the while loop, 2006 is checked if its a leap year, since its not a leap year, increment of 1 will be made to the given year.
In the second iteration, 2007 will be checked, and again will be incremented by 1.
In the third iteration, 2008 will he checked, and since its a leap year, 2008 will be printed to console and 'n' which was earlier 5 will be decremented by 1 to 4, and now the year will be incremented by 4
In the fourth iteration, 2012 will be checked and printed to console and agin 'n' will be decremented by 1
The while loop will keep on interating untill and unless 'n' reaches 0.
