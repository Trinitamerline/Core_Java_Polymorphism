Objective: To demonstrate polymorphism in Java.

Pre-Lab Exercise: Demonstrating classes and objects

Create a class called Book that contains instance variables like BKName,
BKId and BKAuthor, a parameterized constructor to initialize its instance
variables, a method BKUpdateDetails(String name, int id, String author), that
accepts new values for name, Id and author as parameters and updates the
corresponding instance variable values of that object and another method
BKDisplay() to display the book details. Create a class BookDemo and
provide main method for instantiate a Book object, display the original book
details, update its details with new values, and display the updated book
details.

Lab Exercise: To demonstrate compile time polymorphism in Java.

Create a Point class that has two data members x and y of double type. Write
a default constructor which initializes its data members to zero. Write a
parameterized constructor which takes two parameters of double type and
assigns them to its data members. Write another parameterized constructor
that takes one Point object as parameter and copies the values of the passed
object’s data member to the calling object’s data members. Write a
find_distance method that takes two double parameters representing the x, y
values of a point and finds the distance between the calling object and the
passed parameters and returns the distance as double value. Overload the
find_distance method, that takes single Point object parameter and computes
the distance between both the points and returns the distance as a double
value. Write a display method to print the point in the format of “(x, y)”. In
main method create three point objects p1, p2 and p3. Initialize p1 with (3.25,
7.89), p2 with (5.37, 18.12) and p3 with p2. Find distance between p1 and
(7.9, 16.25) using first find_distance method and between p1 and p3 using
second find_distance method.
